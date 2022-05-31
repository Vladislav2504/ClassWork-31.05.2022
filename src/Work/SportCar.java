package Work;

public class SportCar extends  Car{

    private SportCar(){
    }
        public static SportCar getInstance(){
            return SportCarHolder.instance;
    }

    public static class SportCarHolder{
        public static final SportCar instance = new SportCar();

    }



    int speed = 300;
    int  maxSeed;

    private SportCar(int max){
        this.maxSeed= max;
    }

    public void stop() {
        System.out.println();
        super.stop();
        System.out.println("SportCar is stoping");
    }

    public void move() {
        System.out.println("SportCar is moving");
    }

    public String toString() {
        return "SportCar";
    }

    public void setNewName(String name){
        this.name = name;
        System.out.println("New name " + this.name);
    }

    public void setNewName(){
        this.name = "SuperSportCar";
        System.out.println("New name defaut " + this.name);
    }

    public void setNewName(int  name) {
        this.name = Integer.toString(name);
        System.out.println("New name " + name);
    }

    public void setNewName(String model, int  name) {
        this.name = model + Integer.toString(name);
        System.out.println("New name " + name);
    }




}
