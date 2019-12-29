package Threads.ShutdiownHook;

public class HookExampleDemo {
    public static void main(String args[]){
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(new MyThread()));

        System.out.println("Hello sleeping therad  press control c to exit");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Hello press control c to exit");
        }
    }
}
