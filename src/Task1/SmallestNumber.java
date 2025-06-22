package Task1;
import java.util.Scanner;
public class SmallestNumber {
  public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = inputScanner.nextInt();

        System.out.print("Enter second number: ");
        int b = inputScanner.nextInt();

        System.out.print("Enter third number: ");
        int c = inputScanner.nextInt();

        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);

        inputScanner.close();
	

	}

}
