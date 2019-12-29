import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class OutOfMemory2 {

    class Key {
        public String key;

        public Key(String key) {
            this.key = key;
        }
    }

    public void givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory()
            throws IOException, URISyntaxException {
        Map<Object, Object> map = System.getProperties();
        while (true) {
            map.put(new Key("key"), "value");
        }
    }

    public static void main(String args[]) throws Exception{
        OutOfMemory2 outOfMemory2 = new OutOfMemory2();
        outOfMemory2.givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory();
    }
}
