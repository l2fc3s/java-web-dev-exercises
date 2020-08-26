package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        double miles;
        double gas;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? (Numeric only):");

        miles = input.nextDouble();

        System.out.println("How many miles gallons of gas have you used? (Numeric only):");

        gas = input.nextDouble();
        input.close();

        System.out.println("Miles per Gallon: " + miles / gas);

    }

}
