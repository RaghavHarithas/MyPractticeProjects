package Refelction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String arg[]){
        try {

            Class caching = Class.forName("JavaRegEx.RegExPractice");

            Method[]  methods = caching.getDeclaredMethods();
            for(Method method : methods){
               System.out.println("The methods are "+ method.getName()) ;
            }
            Constructor[] constructors = caching.getConstructors();
            for(Constructor constructor : constructors){
                System.out.println("The constrcutors are "+ constructor);
            }
            Field[] fileds = caching.getDeclaredFields();
            for(Field field : fileds){
                System.out.println("The fields are "+ field);
            }
        }catch(Exception e){


        }
    }
}
