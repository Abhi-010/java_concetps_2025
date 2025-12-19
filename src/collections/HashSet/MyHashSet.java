package collections.HashSet;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<E> implements MySet<E>{
    private static int DEFAULT_INITIAL_CAPACITY = 4;
    private static int MAXIMUM_CAPACITY = 1<<30;

    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
    private int capacity;
    private float loadFactorThresload;

    private int size=0;

    private LinkedList<E>[] table;




    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
