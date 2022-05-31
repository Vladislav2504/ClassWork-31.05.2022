package Work;

public class Car extends  AbsCar{

    @Override
    public void move() {
        System.out.println("Car is moving");

    }

    @Override
    void stop() {
        System.out.println("Car is stoping");

    }
}
