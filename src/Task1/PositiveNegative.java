package Task1;
import java.util.Scanner;
public class PositiveNegative {
  public static void main(String[] args) {
		Scanner inputScannner = new Scanner(System.in);
		System.out.print("Enter the number ");
		int n = inputScannner.nextInt();
		
		if( n<0) {
				System.out.println("Negative" );				
		}
		else 
		{
			System.out.println("Positive");
		}
		inputScannner.close();
		
	}

}
