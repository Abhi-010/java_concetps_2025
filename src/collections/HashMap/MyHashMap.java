package collections.HashMap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class MyHashMap<K,V> implements MyMap<K,V> {
    private static int DEFAULT_INITIAL_CAPACITY = 4;
    private static int MAXIMUM_CAPACITY = 1<<30;//2^30
    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

    private int capacity;
    private float loadFactorThreshold ;
    private int size = 0;

    LinkedList<Entry<K,V>>[] table;

    //constructors

    public MyHashMap(int capacity){
        this(capacity,DEFAULT_MAX_LOAD_FACTOR);
    }
    public MyHashMap(){
        this(DEFAULT_INITIAL_CAPACITY,DEFAULT_MAX_LOAD_FACTOR);
    }
    public MyHashMap(int capacity, float loadFactorThreshold){
        if(capacity> MAXIMUM_CAPACITY){
            this.capacity=MAXIMUM_CAPACITY;
        }
        else{
            this.capacity=trimPowerOf2(capacity);
        }
        this.loadFactorThreshold=loadFactorThreshold;
        table = new LinkedList[capacity];
    }

    public int trimPowerOf2(int initialCapacity){
        int capacity=1;
        while(capacity < initialCapacity){
            capacity<<=1;//2,4,8,16
        }
        return capacity;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        if(get(key)!=null){
            int bucketIndex = hash(key.hashCode());
            LinkedList<Entry<K,V>> bucket = table[bucketIndex];

            for(Entry<K,V> entry : bucket){
                if(entry.getKey().equals(key)){
                    V oldValue = entry.getValue();
                    entry.value = value;
                    return oldValue;
                }
            }
        }
        if(size >= capacity * loadFactorThreshold){
            if(capacity == MAXIMUM_CAPACITY){
                throw new RuntimeException("Exceeding maximum capacity");
            }
            rehase();
        }
        int bucketIndex = hash(key.hashCode());
        if(table[bucketIndex] == null){
            table[bucketIndex] = new LinkedList<Entry<K,V>>();
        }
        table[bucketIndex].add(new MyMap.Entry<K,V>(key,value));
        size++;
        return value;
    }

    private void rehase(){
        Set<Entry<K,V>> set = entrySet();
        capacity<<=1;
        table = new LinkedList[capacity];
        size=0;
        for(Entry<K,V> entry : set){
            put(entry.getKey(),entry.getValue());
        }

    }

    //return the set of entries in the map.
    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> set = new HashSet<>();
        for(int i = 0 ; i < size ; i++){
            LinkedList<Entry<K,V>> bucket = table[i];
            for(Entry<K,V> entry : bucket){
                set.add(entry);
            }
        }
        return set;
    }

    private int hash(int hashCode){
        return supplementalHash(hashCode) &(capacity-1);
    }

    private static int supplementalHash(int h){
        h^=(h>>>20) ^ (h>>>12);
        return h ^ (h>>>7) ^ (h>>>4);
    }


    @Override
    public V get(K key) {
        int bucketIndex = hash(key.hashCode());
        LinkedList<Entry<K,V>> bucket = table[bucketIndex];
        for(Entry<K,V> entry : bucket){
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {

    }
}
