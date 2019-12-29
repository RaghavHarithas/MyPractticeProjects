package Threads.RenentrantMonitor;

public class Resource {

    public synchronized void m(){

        n();
        System.out.println("Resource class calling m()");
    }

    public synchronized  void n(){
        System.out.println("Resource class calling n ");
    }
}
