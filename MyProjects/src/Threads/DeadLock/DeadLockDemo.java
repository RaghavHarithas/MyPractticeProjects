package Threads.DeadLock;

public class DeadLockDemo {


    public static void main(String args[]) {
        String a_Resource = "raghav1";
        String b_Resource = "raghav2";

        Thread t1 = new Thread("First Thread") {
            public void run() {
                synchronized (a_Resource) {
                    System.out.println("Obtained lock on a resrource a ...this is Thread " + Thread.currentThread().getName());
                    System.out.println("Trying to Obtain lock on a resrource b...this is Thread " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(200);
//                    }catch(Exception e){
//
//                    }
                        synchronized (b_Resource) {

                        }


                }
            }
        };

        Thread t2 = new Thread("Second Thread") {
            public void run() {
                synchronized (b_Resource) {
                    System.out.println("Obtained lock on a resrource b ...this is Thread " + Thread.currentThread().getName());
                    System.out.println("Trying to Obtain lock on a resrource a...this is Thread " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(200);
//                    }catch(Exception e){
//
//                    }
                    synchronized (a_Resource) {

                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
