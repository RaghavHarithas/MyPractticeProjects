import java.util.Base64;

public class TestByte {


    public static void main(String args[]) {


    byte[] brr = {0x01, 0x02, 0x03};
        String sb=   Base64.getEncoder().encodeToString(brr);


    System.out.println("The string after byte[] is ..."+ sb);
}

}
