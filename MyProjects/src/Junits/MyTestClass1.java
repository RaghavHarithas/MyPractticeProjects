package Junits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestClass1 {


    MyTestableClass myTestableClass;
    String message;
    String salutation;

    @Before
    public void setup(){
        message = "Good Morning, welcome to Junit Writing Test Suites Example";
        salutation = "Hello Sir/Madam";
        myTestableClass = new MyTestableClass(message);
    }



    @Test

    public void testAddSalutation(){
        System.out.println("MyTestClass1 :  testAddSalutation() :: asserting values reqturned ");
        assertEquals(salutation+message,myTestableClass.addSalutation(salutation));


    }

    @After

    public void tearDown(){
        this.message=null;
        this.salutation = null;
        myTestableClass = null;
    }
}
