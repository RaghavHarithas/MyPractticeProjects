package Junits;

public class MyTestableClass {

    String message = null;


    /*
       We write some methods here which can be tested
     */

    MyTestableClass(String message ){
        this.message=message;

    }

    public String  printMessage(){


        System.out.println("The message from our Junit class is "+ message);
        return this.message;

    }


    /*
        Add salutation to mesage
     */
    public String addSalutation(String salutaion){

        String message1 = salutaion+ message;
        System.out.println(" The saluted messgae is "+ message1);
        return message1;
    }

    public int divideTwoNunesr(int a , int b) throws ArithmeticException{

        int result = a/b;
        return result;
    }


}
