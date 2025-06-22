package Task1;
import java.util.Scanner;
public class PrintTheNumbers {
  public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m =  inputScanner.nextInt( );
		System.out.println("Enter the ending number");
		int n  =  inputScanner.nextInt();
		for(int i=m; i<=n; i ++) 
		{
			System.out.println(i);
		}
		inputScanner.close();
	}

}
