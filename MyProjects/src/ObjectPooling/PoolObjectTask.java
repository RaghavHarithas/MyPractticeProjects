package ObjectPooling;

import java.util.concurrent.Callable;

public class PoolObjectTask implements Runnable {

    ObjectPool<PoolObject> pool = null;
    int theradNo ;
     public PoolObjectTask(ObjectPool<PoolObject> pool, int threadNo){
         this.pool =pool;
         this.theradNo=threadNo;

     }

    public void run(){
         PoolObject borrowedObject = pool.borrowObject();
         System.out.println("The borrowed object processNo is "+ borrowedObject.getProcessNo()+" from therad no "+this.theradNo);


         pool.returnObject(borrowedObject);

        System.out.println("The returned object processNo is "+ borrowedObject.getProcessNo()+" from therad no "+this.theradNo);
    }

}
