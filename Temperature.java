import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Enter F: ");
                    f = input.nextDouble();
                    System.out.println("C: " + fahrenheitToCelsius(f));
                    break;
                }
                case 2:{
                    System.out.println("Enter C: ");
                    c = input.nextDouble();
                    System.out.println("F: " + celsiusToFahrenheit(c));
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}