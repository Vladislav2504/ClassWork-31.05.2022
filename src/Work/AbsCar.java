package Work;

public abstract class AbsCar implements  Move {

    String name;

    abstract void stop();

    static void test() {
        System.out.println("its static");
    }




}
