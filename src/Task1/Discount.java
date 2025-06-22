package Task1;
import java.util.Scanner;
public class Discount {
public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = inputScanner.nextDouble();
        double discount = 0.0;

        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.10; // 10%
        } else if (purchaseAmount > 1000) {
            discount = 0.20; // 20%
        }

        double finalAmount = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Final  amount to Pay : ₹" + finalAmount);

        inputScanner.close();
	}

}
