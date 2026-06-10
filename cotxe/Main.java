package tasca1.cotxe;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("A3", 120);
        Car c2 = new Car("Q2", 85);

        Car.showBrand();

        c1.showInfo();
        c2.showInfo();

        Car.brake();

        Car car = new Car("A3", 120);

        car.accelerate();
    }
}