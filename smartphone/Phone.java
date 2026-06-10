package tasca1.smartphone;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public void call(String number) {
        System.out.println("You are calling the number " + number);
    }
    public interface Camera {
        void takePhoto();
    }
    public interface Clock {
        void ringAlarm();
    }

}
