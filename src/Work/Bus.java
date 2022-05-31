package Work;

public  class Bus extends AbsCar{
    @Override
    public void move() {
        System.out.println("Bus is moving");
    }

    public void stop() {
        System.out.println("Bus is stoping");
    }

}
