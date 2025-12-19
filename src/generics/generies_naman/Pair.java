package generics.generies_naman;


public class Pair {
    Object first;
    Object second;

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
}
