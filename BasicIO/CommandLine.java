import java.util.Scanner;
public class CommandLine {

	private static Scanner scan;

	public static void main(String[] args) {
		String foo;
		scan = new Scanner(System.in);
		System.out.println("hello world!");
		System.out.print("enter:");
		foo=scan.nextLine();
		System.out.println("you input a " +foo);
	}

}
