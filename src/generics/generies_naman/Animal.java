package generics.generies_naman;

import java.util.List;

public class Animal extends B{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String sound(String name){
        return name + "Animal Sound";
    }
    public static void printListOfAnimal(List<? extends Animal> list){
        for(Animal animal : list){
            System.out.println(animal.name);
        }
    }
}
