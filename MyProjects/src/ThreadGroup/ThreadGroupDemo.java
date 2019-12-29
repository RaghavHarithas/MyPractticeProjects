package ThreadGroup;

/*
   ThreadGroup is used to groupthreads into single object so that all therads can be puased, suspsedned at a time
 */

public class ThreadGroupDemo  implements  Runnable {


        public void run(){
            System.out.println("The thread group is  "+ Thread.currentThread().getThreadGroup().getName()+ "thread name is "+ Thread.currentThread().getName());
        }


    public static void main(String args[]){

        ThreadGroup threadGroup = new ThreadGroup("My Thread Group");
        ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        Thread t1= new Thread(threadGroup,threadGroupDemo,"1st Thread");
        Thread t2= new Thread(threadGroup,threadGroupDemo,"2nd Thread");
        Thread t3 = new Thread(threadGroup,threadGroupDemo,"3rd Thread");

        t1.start();
        t2.start();
        t3.start();


    }
}
