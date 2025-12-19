package abstract_class_interfaces.interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird() ;

        FlightEnabled superMan = new SuperMan() ;
        superMan.fly();

        //FlightEnabled flightEnabled = bird ;
        //flightEnabled.takeOff();

//        inFlight(bird);
//
//        inFlight(new Jet());


    }

    public static void inFlight(FlightEnabled flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();
        if(flightEnabled instanceof Trackable tracked){
            tracked.track();
        }
        flightEnabled.land();
    }
}
