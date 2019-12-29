package Refelction;

import java.lang.reflect.Method;

public class InvokePrivateMethods {


    public static void main(String args[]) {
        try {
            Class regExPractice = Class.forName("JavaRegEx.RegExPractice");

            Method method = regExPractice.getDeclaredMethod("isValPassword", String.class);
            method.setAccessible(true);
            method.invoke(regExPractice.newInstance(), "raghav");

        } catch (Exception e) {
            System.out.println("Exception caught while calling private method"+ e.getMessage());
        }

    }
}
