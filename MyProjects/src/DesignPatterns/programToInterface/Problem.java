package DesignPatterns.programToInterface;

/*

   oo dESIGN pRINCIPLE:

    wE SHOULD NEVER CODE TO AN IMPLEMENTATION , WE NEED TO CODE TO AN inteerce


    Object oriented principle

     Lets take an example
       Duck simulation game


 */

public class Problem {


    class Duck {

        public void swim() {

            System.out.println("I can swim");


        }

        public void quack() {

            System.out.println(" I can quack : Quack Quack");

        }

        public void display() {

        }


    }

    class MallatdDukck extends Duck {

        public void display() {
            ;
            System.out.println(" Hello I am Malaled Duck...");
        }
    }


    class GoatDuck extends Duck {

        public void display() {
            System.out.println("Hello I am GoatDuck ...");
        }
    }


    public static void main(String args[]) {

        /*


   Mallard Duck and Goat Duck
        MallatdDukck mallatdDukck = new MallatdDukck();
        mallatdDukck.display();
         mallatdDukck.swim();
         mallatdDukck.quack();


         GoatDuck goatDuck = new GoatDuck();
         goatDuck.display();
         goatDuck.swim();
         goatDuck.quack();

         */
    }

}









