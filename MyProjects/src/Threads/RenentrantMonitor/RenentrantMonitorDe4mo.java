package Threads.RenentrantMonitor;


/*
In ajav once lock is obtained in monitor...the same loc/monitor can be used resued for difefrent synchornized methods...provide...other method is called
from the first method
 */
public class RenentrantMonitorDe4mo {

public static void main(String args[]){
    Resource resource = new Resource();

    Thread t1 = new Thread("thread 1"){
        public void run(){
            System.out.println(" Thread "+ Thread.currentThread().getName() +" accessing resource");
            resource.m();
        }
    };

    t1.start();

}

}
