package ThreadPool;

public class WorkerThread implements  Runnable {
    private String message;
    WorkerThread(String message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("The therad running in therad pool is "+ Thread.currentThread().getName() + "Start" + "message is "+ message);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){

        }
        System.out.println("The therad running in therad pool is "+ Thread.currentThread().getName() + "End");
    }


}
