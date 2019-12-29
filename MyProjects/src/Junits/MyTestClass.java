package Junits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestClass {


    MyTestableClass myTestableClass;
    String message;
    String salutation;

    @Before
    public void setup(){
        message = "Good Morning, welecome to Junit Writing Test Suites Example";
        salutation = "Hello Sir/Madam";
        myTestableClass = new MyTestableClass(message);
    }


    @Test

    public void testPrintMessage(){
        System.out.println("MyTestClass :  testPrintMessage() ::  asserting values returned");
        assertEquals(message,myTestableClass.printMessage());

    }

    @Test

    public void testDivideTwoNumbers(){

        int result = myTestableClass.divideTwoNunesr(32,8);

        System.out.println("MyTestClass :  testDivideTwoNumbers() ::  asserting values returned for innput 32,8  is "+result);

        assertEquals(result,4);
    }


    @Test(expected =  ArithmeticException.class)

    public void testDivideTwoNumbersAritException(){
        System.out.println("MyTestClass :  testDivideTwoNumbersAritException() ::  asserting values returned");
        int result = myTestableClass.divideTwoNunesr(32,0);
        //assertEquals(result,4);
    }



    @After

    public void tearDown(){
        this.message=null;
        this.salutation = null;
        myTestableClass = null;
    }

}
