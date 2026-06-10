package tasca1.cotxe;

public class Car {

    static final String brand = "Audi";
    static String model;
    final int power;

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public static void showBrand() {
        System.out.println("Brand: " + brand);
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Power: " + power);
    }

    public static void brake() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerate() {
            System.out.println("El vehicle està accelerant");
    }
}
