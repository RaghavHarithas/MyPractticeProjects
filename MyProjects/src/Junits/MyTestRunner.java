package Junits;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class MyTestRunner {

    public static void main(String args[]){
        Result result = JUnitCore.runClasses(MyTestSuite.class);

        List<Failure> failureList = result.getFailures();
        if(failureList != null && failureList.size() > 0){
            System.out.println("The Junit Test Run for Suite has failures printig the failures..."+ failureList);
        }else{
            System.out.println("The test result was sucessful"+ result.wasSuccessful() );
        }
    }
}
