package Work;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {

        AbsCar car = new Car();

        AbsCar bus = new Bus();

//        AbsCar SportCar = new SportCar();

        Truck truck = new Truck();

        Truck truck1 = new Truck();

        truck.name = "test";

        truck1.name = "test";

        if (truck == truck1){
            System.out.println("Hi");
        }  else  {
            System.out.println("Are you kidding");
        }

        AbsCar SportCar1 = SportCar.getInstance();
        AbsCar SportCar2 = SportCar.getInstance();

        if (SportCar1 == SportCar2) {
            System.out.println("Hi");
        }




//
//        car.move();
//        bus.move();
//
//
//        car.move();
//        AbsCar.test();
//        bus.stop();
//        Truck.stop();


    }
}
