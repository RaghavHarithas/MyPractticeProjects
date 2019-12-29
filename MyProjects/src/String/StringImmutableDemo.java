package String;

public class StringImmutableDemo {


    public static void main(String args[]){
        String s1 = new String("raghav");
        System.out.println(s1);
        s1.concat("har");
        s1 = s1.concat("har");
        System.out.println(s1);
        System.out.println(50+40+"raghav"+50+40);
    }
}
