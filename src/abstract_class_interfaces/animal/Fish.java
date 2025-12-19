package abstract_class_interfaces.animal;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println("Fish is swimming slowly");
        }
        else{
            System.out.println("Fish is scared and swimming fast");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equals("GoldFish")){
            System.out.println("Swish");
        }
        else{
            System.out.println("Splash");
        }
    }


}
