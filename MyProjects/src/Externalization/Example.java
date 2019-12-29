package Externalization;

import java.io.*;

public class Example {







    public static void main(String args[]) throws Exception{
        File file = new File("abc.txt");

        User user = new User("raghav", "",32,"M");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(user);

        User readObject =  (User) new ObjectInputStream( new FileInputStream(file)).readObject();
        System.out.println("The read object after externalizing and e extrenalizing is ... user name is "+ readObject.getUserName()+ " age is "+ readObject.getAge()+ "gneder is "+ readObject.getGender());

    }
}
