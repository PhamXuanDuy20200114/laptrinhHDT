//#Exercise 6.2:
import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = scanner.nextLine();
		System.out.println("How old are you?");
		int iAge = scanner.nextInt();
		System.out.println("How tall are you?");
		double dHeight = scanner.nextDouble();
		// similar to the other data types
		System.out.println("Mr/Mrs."+strName+"\nAge: "+iAge+"\nHeight: "+dHeight);
		System.exit(0);
	}
}
