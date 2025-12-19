package abstract_class_interfaces.animal;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        Dog dog = new Dog("German Sherferd","medium", 44.3) ;
        ArrayList<Animal> list = new ArrayList<>() ;

        list.add(dog);
        list.add(new Dog("indie","small", 33)) ;
        list.add(new Fish("fish","medium", 2));

        for(Animal animal : list){
            doAnimalStuff(animal);
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.move("slow");
        animal.makeNoise();
    }
}
