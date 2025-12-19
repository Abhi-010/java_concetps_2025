package generics.generies_naman;

import java.util.List;

public class GenericsPair<FIRST,SECOND> {
    private FIRST first;
    private SECOND second;

    public GenericsPair(){

    }

    public GenericsPair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public void setFirst(FIRST first) {
        this.first = first;
    }

    public SECOND getSecond() {
        return second;
    }

    public void setSecond(SECOND second) {
        this.second = second;
    }

    public void doSomethingOnFirst(String greeting){

        System.out.println(greeting);
        System.out.println(first);
        System.out.println(second);
    }

    public void printMoreFirst(List<? extends FIRST> firsts){
        for(FIRST f : firsts){
            System.out.println(f);
        }
    }

    public void printTest(List<?> u){
        System.out.println(u);
    }
}
