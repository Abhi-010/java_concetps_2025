package collections.HashSet;

public interface MySet<E> extends Iterable<E> {
    public boolean isEmpty();
    public boolean add(E e);
    public boolean remove(E e);
    public int size();
    public boolean contains(E e);
    public void clear();
}
