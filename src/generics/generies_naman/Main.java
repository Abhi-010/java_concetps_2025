package generics.generies_naman;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // int[] testarray = new int[5];

        GenericsPair<Animal,Integer> animalCounts = new GenericsPair<>();

        Animal a1 = new Animal("Cat",1);
        Animal a2 = new Animal("Lion",1);

        Dog d1 = new Dog("dog", 12, 6);
        Dog d2 = new Dog("dog1", 12, 3);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(d1);
        dogList.add(d2);

        animalCounts.printMoreFirst(List.of(d1,d2));
        animalCounts.printMoreFirst(dogList);

        animalCounts.printTest(dogList);

        List<Number> listNumber = new ArrayList<>();
        listNumber.add(3L);

        Object objectArray[] = new Integer[10];
        Animal [] test2 = new Dog[6];
        //List<Object> objectList = new ArrayList<Integer>();
    }

//    public <T> T[] getArray(int size) {
//        T[] genericArray = new T[size]; // suppose this is allowed
//        return genericArray;
//    }
}
