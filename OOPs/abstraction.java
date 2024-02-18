abstract class Car{
    abstract void color();

    abstract void model();

    void features(){
        System.out.println("This is a luxary car....");
    }
}

abstract class Audi extends Car{

    public void color(){
        System.out.println("Drak Green");
    }

    // public void features(){
    //     System.out.println("Latest GPS technology");
    // }

}

class AudiQ extends Audi{
    public void model(){
        System.out.println("It is E-Class series");
    }
}
public class abstraction {
    public static void main(String[] args) {
        // Car obj = new Car();

        // Car obj = new AudiQ();

        Car car = null;  // we can create reference variable for an abstract class
        car = new AudiQ();

        car.features();
        car.model();
        car.color();
    }
}
