package Task1;
import java.util.Scanner;
public class NumberPattern {
  public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = inputScanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - i - 1; j--) {
                System.out.print(j);
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(n - i);
            }
            System.out.println();
        }

        // Final line (e.g., 54321)
        for (int j = n; j >= 1; j--) {
            System.out.print(j);
        }

        inputScanner.close();
	}

}
