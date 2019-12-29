package DesignPatterns.factoryPattern;

public class SimpleFactoryPattern {

     /*
      Pizza Class
     */

    class Pizza{

        public void prepare(){

            System.out.println("Preparing Pizza");

        };


        public void bake(){
            System.out.println(" Baking pizza");
        }

        public void cut(){
            System.out.println("Cutting pizza");
        }

        public void box(){
            System.out.println("Boxing the pizza");
        }


    }

    class CheesePizza extends Pizza {

    }

    class PanerrPizza extends Pizza {

    }

    class ChickenPizza extends Pizza {

    }

    /*

        Simple Factory whic cerats instances of conceret classes readily for you
     */

    class SimpleFactory {

        Pizza pizza ;
         public Pizza createPizza(String type){

             if(type.equals("Chesse")){
                 pizza = new CheesePizza();
             }else if(type.equals("Paneer")){
                 pizza = new PanerrPizza();
             }else if(type.equals("Chicken")){
                 pizza = new ChickenPizza();
             }

           return pizza;

         }

    }


    /*
       Our Pizza Store which allows to order pizza
     */

    class PizzaStore {
        Pizza pizza;

        public void ordrePizza(String type){


            /*
              Call SimpleFactory to get ur pizza baswd on type
             */

            SimpleFactory simpleFactory = new SimpleFactory();

            pizza = simpleFactory.createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }
    }

    public static void main(String args[]){
        /*
            Order Panner Pizza
         */
        /*
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.ordrePizza("Paneer");
        */
    }
}
