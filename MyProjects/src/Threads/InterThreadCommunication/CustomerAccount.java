package Threads.InterThreadCommunication;

public class CustomerAccount {

    private  long amount = 0;
    private static int accountNumber = 1242525;

    public void withdrawAmount(long amount){
        System.out.println(" Trying Withdrwaing amount "+amount+" in customer account number "+accountNumber);

        synchronized (this) {
            if (this.amount < amount) {

                System.out.println("Customer account has less balance...wait for him to deposit money");

                try {
                    wait();
                } catch(Exception e){

                }
            }

                this.amount-=amount;
                System.out.println(" Withdrawn amount "+amount+" in customer account number "+accountNumber);
            System.out.println(" The current balance after withdrawing amount "+ amount+ " is "+ this.amount);


        }
    }
    public void deposit(long amount){
        System.out.println(" Trying deposit amount "+amount+" in customer account number "+accountNumber);

        synchronized (this){
            this.amount+= amount;
            System.out.println("Depositted amount "+amount+" in customer account number "+accountNumber);

            System.out.println(" The current balance after depostting amount "+ amount+ " is "+ this.amount);

            notify();

        }
    }

}
