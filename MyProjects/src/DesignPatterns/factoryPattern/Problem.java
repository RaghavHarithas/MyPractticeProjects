package DesignPatterns.factoryPattern;


/*

  Imagine u have a Pizza Stor , whih dleievers pizza

  so u have calss pizza , whihc methods prepre, bake,cut,box
  PizzaStore uses these methods to cerate and deliver pizza

  suppose u have diffrent pizzas each time , the u would be cerating instances of different pizzas each time ,

  it will be concarte implememtation...we would be creating concrete implementation each time which is wrong
 */

public class Problem {



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

    class CheesePizza extends  Pizza{

    }

    class PanerrPizza extends Pizza{

    }

    class ChickenPizza extends Pizza {

    }


    /*
       Our Pizza Store which allows to order pizza
     */

    class PizzaStore {
         Pizza pizza;

        public void ordrePizza(String type){


            /*
                  Here based on type of pizza we are cerate concete claaes here in ordere pizza, which is wrong
                  imagine if new pizzaa come vertyime we gon adding code here, which is wrong
                  It breks open for extension and clsoed for modifictaion oo principles

                  and creation of so many concere classes
             */

            if(type.equals("Chesse")){
                pizza = new CheesePizza();
            }else if(type.equals("Paneer")){
                pizza = new PanerrPizza();
            }else if(type.equals("Chicken")){
                pizza = new ChickenPizza();
            }


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
