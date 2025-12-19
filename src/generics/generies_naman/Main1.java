package generics.generies_naman;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {



        List<Pair> l = List.of(new Pair("hi","hey"), new Pair(1,2),new Pair("hello",4.5)) ;

        for(Pair p : l){
            String f =(String)p.getFirst() ;
            String s = (String)p.getSecond() ;

            System.out.print(" f " + f);
            System.out.print(" s " + s);
            System.out.println();
        }

//        getValue(new ArrayList<>(), 1, "2");
//        Integer andReturn = getAndReturn(1, 2);
//        getAndReturn(1, "2");
//
//        List<?> wildcardList = new ArrayList<String>();
//        //List<Object> objectList = new ArrayList<Integer>(); // Compilation error
//
//        Dog d1 = new Dog();
//        Dog d2 = new Dog();
//        List<Dog> dogList = new ArrayList<>();
//        dogList.add(d1);
//        dogList.add(d2);
        //++
        //
        // printAnimals(dogList);


    }
    public static void printAnimals(List< Animal> animalList){
        for(Animal animal : animalList){
            System.out.println(animal);
        }
    }

    public static <T> T getAndReturn(T n1, T n2){
        return n1;
    }

    public static <T> void getValue(T n1, T n2){
        System.out.println(n1.getClass().getName());
        System.out.println(n2.getClass().getName());
    }

    // getValue(new ArrayList<>(), 1, "2");
    public static <T> void getValue(ArrayList<T> list , T n1, T n2){
        System.out.println(n1.getClass().getName());
        System.out.println(n2.getClass().getName());

        list.add(n1);
        list.add(n2);
        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(1).getClass().getName());
        System.out.println("list class name " + list.getClass().getName());

    }
}
