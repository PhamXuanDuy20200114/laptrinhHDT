//Exercise 6.3: 
import java.util.Scanner;
public class Triangle {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int i,n;
		System.out.println("Enter n: ");
		n = scanner.nextInt();
		for(i=0;i<n;i++) {
			for (int space = 1; space <= n - i; ++space) {
		        System.out.print("  ");
		      }
			int k = 0;
			while (k != 2 * i +1) {
		        System.out.print("* ");
		        ++k;
		      }
			System.out.println("\n");
		}
	}
}
