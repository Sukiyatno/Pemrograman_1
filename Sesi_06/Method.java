import java.util.Scanner;

public class Method {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		Tuna tunaObject = new tuna ();

		System.out.println("Enter your name here : ");
		String name = input.nextLine();

		tunaObject.SimpleMessage(name);
	}
}