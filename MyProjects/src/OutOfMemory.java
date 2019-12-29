import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemory {
    private Random random = new Random();
    private static List<Double> list = new ArrayList<>();

    private void fillArrayList() throws Exception{
        for(int i=1; i< 1000000;i++){
            list.add(random.nextDouble());
        }
        System.gc();
        Thread.sleep(10000);
    }

    public static void main(String args[]) throws Exception{
        OutOfMemory outOfMemory = new OutOfMemory();
        outOfMemory.fillArrayList();
    }

}
