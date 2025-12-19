package collections.HashMap;

import java.util.Set;

public interface MyMap<K,V> {
    public boolean isEmpty();

    public V put(K key, V value);

    public V get(K key);

    public void remove(K key);
    public Set<Entry<K,V>> entrySet();

    public static class Entry<K,V>{
        K key;
        V value;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
}
