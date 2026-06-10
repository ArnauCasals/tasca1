package tasca1.smartphone;
import java.util.Scanner;
1
public class Main {
    public static void main(String[] args) {


        Smartphone phone = new Smartphone("Apple", "iPhone 15");

        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Make a call");
            System.out.println("2. Take a photo");
            System.out.println("3. Activate alarm");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter phone number: ");
                    String number = sc.next();
                    phone.call(number);
                    break;

                case 2:
                    phone.takePhoto();
                    break;

                case 3:
                    phone.ringAlarm();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 0);

        sc.close();
    }
}
