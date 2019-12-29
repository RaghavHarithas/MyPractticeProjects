package Threads.InterThreadCommunication;

public class InterThreadCommDemo {

    public static void main(String args[]){

        CustomerAccount customerAccount = new CustomerAccount();

        Thread t1 = new Thread("Withdraw Thread"){
            public void run(){
                customerAccount.withdrawAmount(10000);
            }
        };

        Thread t2 = new Thread(" Deposit Thread"){
            public void run(){
                customerAccount.deposit(15000);
            }
        };

        t1.start();
        t2.start();
    }
}
