package ThreadPool;

/*
     Thread Pool:
     Thtead Pool id a pool of user thread wiating to execute the tasks...one of the user  thetads pick up the task and executes and goes back into waiting state for inest task

     Thread Pool is advantageous because of performance , fatsre execution  results are produceed faster

     Thease therads work in paralelle and as result perfomance is incaresedd

     No new therad are cerated...existing threads whic are in pool are picked up and assignaged tasks ..

     example: it is used by container in servelets, to receive the rquests ...therad pooling is used to server the requeststs
    Java Thread pooling is down through executor framwework

    It ceraeds a therad pool ...to thsi therad pool we assign owrkers

    and toexecutor we pass workers...

 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(5);

        for(int i=1;i<=10;i++){
            Runnable runnable = new WorkerThread(" "+i);
            service.execute(runnable);
        }

        service.shutdown();

        while(!service.isTerminated()) {

        }

        System.out.println("Finisihing all Threads ");
    }



}
