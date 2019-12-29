package Caching;

import java.util.*;

public class CacheUsingObjectAndThread<K,V> {

  private long timeToLeave;

  private Cache lruCache;

    public CacheUsingObjectAndThread(long timetoLeave, long ctimeIntervalThread, int maxSize){
        timetoLeave = timeToLeave* 1000;
        lruCache = new Cache(maxSize);

        if( timetoLeave > 0 && ctimeIntervalThread > 0){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(ctimeIntervalThread * 1000);
                        } catch (InterruptedException e) {

                        }
                        cleanup();
                    }
                }
            });
            t.setDaemon(true);
            t.start();



        }
    }

class Cache<K,V> extends LinkedHashMap<K,V>{
    private final int SIZE;

    Cache(int size){
        super(size,0.75f,true);
        this.SIZE=size;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.SIZE;
    }

}

class CacheObject{
    public long getAcessedTime() {
        return acessedTime;
    }

    public void setAcessedTime(long acessedTime) {
        this.acessedTime = acessedTime;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private long acessedTime;
    private V value;
    CacheObject(V value){
        this.value = value;
        this.acessedTime=System.currentTimeMillis();
    }


    }
    public void put(K key,V value)

    {
        synchronized (lruCache){
            lruCache.put(key,new CacheObject(value));
        }

    }

    public void remove(K key){
        synchronized (lruCache){
            lruCache.remove(key);
        }
    }

    public V get(K key) {
        CacheObject cacheObject = (CacheObject) lruCache.get(key);
        if (cacheObject != null) {
            cacheObject.acessedTime = System.currentTimeMillis();
            return cacheObject.value;
        } else {
            return null;
        }
    }

    public void cleanup(){
        long now = System.currentTimeMillis();

        //clean up old objects from the map
        //ineterate over the map
        List<K> deletedKeys = new ArrayList<K>();
        Set<Map.Entry> entrySet = lruCache.entrySet();
        for(Map.Entry<K,V> entry : entrySet){
            K key = entry.getKey();
            CacheObject value = (CacheObject)entry.getValue();
            if(value != null && (now > (timeToLeave+ value.acessedTime))){
                deletedKeys.add(key);
            }

        }

        for(K key : deletedKeys){
            synchronized (lruCache){
                lruCache.remove(key);
            }

        }

        Thread.yield();






}

    public int size() {
        synchronized (lruCache) {
            return lruCache.size();
        }
    }



}
