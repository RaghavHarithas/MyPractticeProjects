package ObjectPooling;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public  abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> concurrentLinkedQueue = null;
    ScheduledExecutorService scheduledExecutorService;

    public ObjectPool(int minIdle) {
        initialize(minIdle);
    }


    public ObjectPool(int minIdel, int maxidle, int validationInterval) {

        initialize(minIdel);
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {

            @Override
            public void run() {
                int size = concurrentLinkedQueue.size();
                if (size < minIdel) {
                    int sizeToBeAdded = minIdel - size;
                    for (int i = 1; i <= sizeToBeAdded; i++) {
                        concurrentLinkedQueue.add(createObject());
                    }

                } else if (size > maxidle) {
                    int sizeToBeRemoved = size - maxidle;
                    for (int i = 1; i <= sizeToBeRemoved; i++) {
                        concurrentLinkedQueue.poll();
                    }
                }
            }


        }, validationInterval, validationInterval, TimeUnit.SECONDS);


    }

    public abstract T createObject();

    private void initialize(int minIdel){
        concurrentLinkedQueue= new ConcurrentLinkedQueue<T>();
        for(int i=0;i< minIdel;i++){
            concurrentLinkedQueue.add(createObject());
        }

    }

    public T borrowObject(){
        T object;
        if((object = concurrentLinkedQueue.poll()) == null)
            object = createObject();

        return object;


    }
    public void returnObject(T object){
        if(object == null)
            return;
        concurrentLinkedQueue.offer(object);
    }



}
