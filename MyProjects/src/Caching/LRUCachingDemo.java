package Caching;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCachingDemo {
   public  static void main(String args[]){
       LRUCache lruCache = new LRUCache(3);
       for(int i=1;i<=9;i++){
           int value = 100*i+10*i+i;
           lruCache.put(i,value);
       }
       //System.out.println("the value at key 8 is "+lruCache.get(8));
       System.out.println("the LRU cache map contents is ...."+ lruCache);
   }

}

class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private  final int SIZE;

    LRUCache(int size){
        super(size,0.75f,true);
        this.SIZE=size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > this.SIZE;
    }
}
