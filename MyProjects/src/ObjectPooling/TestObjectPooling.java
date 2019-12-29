package ObjectPooling;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestObjectPooling {
    AtomicInteger processNo = new AtomicInteger(1);
    ObjectPool<PoolObject> pool =null;

    @Before
    public void setUp(){
        pool = new ObjectPool<PoolObject>(4,10,5){
            public  PoolObject createObject(){
                return  new PoolObject(processNo.getAndIncrement(),"/tmp/process");
             }
        };
    }

    @Test
    public void testObjectPooling(){

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<PoolObjectTask> poolObjectTaskList = new ArrayList<>();
        for(int i=1;i<=8;i++){
            executorService.execute(new PoolObjectTask(pool,i));
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
