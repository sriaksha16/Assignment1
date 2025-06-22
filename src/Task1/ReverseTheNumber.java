package Task1;
import java.util.Scanner;
public class ReverseTheNumber {
  public static void main(String[] args) {
	Scanner	inputScanner = new Scanner(System.in);
	System.out.println("Enter the Number");
	int number = inputScanner.nextInt();
	int reversed = 0;

    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }

    System.out.println("Reversed number : " + reversed);
    inputScanner.close();
}


}
