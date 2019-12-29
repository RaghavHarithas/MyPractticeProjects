package DesignPatterns.AbstractFactoryFactoryMethod;

import DesignPatterns.factoryPattern.SimpleFactoryPattern;

public class AbstractFactoryPattern {
    
    /*
      Pizza Class
     */

    abstract class Pizza {

        PizzaIngredientFactory pizzaIngredientFactory;

        public abstract void prepare();


        public void bake() {
            System.out.println(" Baking pizza");
        }

        public void cut() {
            System.out.println("Cutting pizza");
        }

        public void box() {
            System.out.println("Boxing the pizza");
        }


    }

    class NyCheesePizza extends Pizza {
        PizzaIngredientFactory pizzaIngredientFactory;

        NyCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createCheese();
        }

    }

    class NYVegPizza extends Pizza {

        PizzaIngredientFactory pizzaIngredientFactory;

        NYVegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createVeggies();
        }

    }

    class NYCalmPizza extends Pizza {

        PizzaIngredientFactory pizzaIngredientFactory;

        NYCalmPizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createCalm();
        }

    }

    class ChicagoCheesePizza extends Pizza {

        PizzaIngredientFactory pizzaIngredientFactory;

        ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createCheese();
        }


    }

    class ChiacgoVegPizza extends Pizza {
        PizzaIngredientFactory pizzaIngredientFactory;

        ChiacgoVegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createVeggies();
        }


    }

    class ChicagoCalmPizza extends Pizza {
        PizzaIngredientFactory pizzaIngredientFactory;

        ChicagoCalmPizza(PizzaIngredientFactory pizzaIngredientFactory) {
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }

        public void prepare() {
            this.pizzaIngredientFactory.createDough();
            this.pizzaIngredientFactory.createSauce();
            this.pizzaIngredientFactory.createVeggies();
        }

    }

    /*
       Dough Interface
     */
    interface Dough {

    }

    class ThinCrustDough implements Dough {

    }


    class ThickCrustDough implements Dough {

    }


    /*
      Inerface Sauce
     */

    interface Sauce {

    }

    class Camari implements Sauce {

    }

    class Mustard implements Sauce {

    }


    class Veggies {

    }

    class Mushroom extends Veggies {

    }

    class Onion extends Veggies {

    }

    class Paneer extends Veggies {

    }

    class Tomato extends Veggies {

    }


    interface Calm {

    }

    class FreshCalm implements Calm {

    }

    class GoatCut implements Calm {

    }

    interface Cheese {

    }


    class MozaRella implements Cheese {

    }

    class Caligari implements Cheese {

    }
     /*
         Pizza Ingerdeient Factory
      */

    interface PizzaIngredientFactory {

        public Dough createDough();

        public Cheese createCheese();

        public Calm createCalm();

        public Sauce createSauce();

        public Veggies[] createVeggies();

    }

    /*
       NY Pizaa IngredientFactory
     */
    class NYIngredientFactory implements PizzaIngredientFactory {

        @Override
        public Dough createDough() {
            return new ThinCrustDough();
        }

        @Override
        public Cheese createCheese() {
            return new Caligari();
        }

        @Override
        public Calm createCalm() {
            return new FreshCalm();
        }

        @Override
        public Sauce createSauce() {
            return new Camari();
        }

        @Override
        public Veggies[] createVeggies() {
            Veggies[] veggies = {new Mushroom(), new Onion(), new Onion()};
            return veggies;
        }
    }


    class ChicagoIngredientFcatory implements PizzaIngredientFactory {

        @Override
        public Dough createDough() {
            return new ThickCrustDough();
        }

        @Override
        public Cheese createCheese() {
            return new MozaRella();
        }

        @Override
        public Calm createCalm() {
            return new GoatCut();
        }

        @Override
        public Sauce createSauce() {
            return new Mustard();
        }

        @Override
        public Veggies[] createVeggies() {
            Veggies[] vegiies = {new Onion(), new Tomato(), new Paneer()};
            return vegiies;
        }

    }
    /*
       Our Pizza Store which allows to order pizza
     */

    abstract class PizzaStore {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory;


        public abstract Pizza createPizza(String type);


        public void ordrePizza(String type) {


            pizza = createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }
    }

    class NYPizzaStore extends PizzaStore {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory;

        public Pizza createPizza(String type) {
            pizzaIngredientFactory = new NYIngredientFactory();

            if (type.equals("Cheese")) {
                pizza = new NyCheesePizza(pizzaIngredientFactory);
            } else if (type.equals("Veggies")) {
                pizza = new NYVegPizza(pizzaIngredientFactory);
            } else if (type.equals("Calm")) {
                pizza = new NYCalmPizza(pizzaIngredientFactory);
            }

            return pizza;

        }


    }


    class ChicagoPizzaStore extends PizzaStore {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory;

        public Pizza createPizza(String type) {
            pizzaIngredientFactory = new ChicagoIngredientFcatory();

            if (type.equals("Cheese")) {
                pizza = new ChicagoCheesePizza(pizzaIngredientFactory);
            } else if (type.equals("Veggies")) {
                pizza = new ChiacgoVegPizza(pizzaIngredientFactory);
            } else if (type.equals("Calm")) {
                pizza = new ChicagoCalmPizza(pizzaIngredientFactory);
            }

            return pizza;

        }


    }


    public static void main(String args[]) {
      /*
       Tes our pattern
       */
     /*
        Ordere NY Chhese Pizza
     */

     /*
       PizzaStore pizzaStore = new NYPizzaStore();
       pizzaStore.ordrePizza("Cheese");
     */


     /* Order Chicago Veg Pizza */

        /*

        PizzaStore pizzaStore =  new ChicagoPizzaStore();
        pizzaStore.ordrePizza("Veggies");

        */












    }
}
