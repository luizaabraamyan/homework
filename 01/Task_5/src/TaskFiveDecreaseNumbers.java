import java.util.Scanner;

public class TaskFiveDecreaseNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();

		System.out.println("Enter second number: ");
		int b = input.nextInt();

		System.out.println("Enter third number: ");
		int c = input.nextInt();

		if ((a > b) && (a > c) && (b > c)) {
			System.out.println(a + " " + b + " " + c);
		}

		if ((a > b) && (a > c) && (c > b)) {
			System.out.println(a + " " + c + " " + b);
		}

		if ((b > a) && (b > c) && (a > c)) {
			System.out.println(b + " " + a + " " + c);
		}

		if ((b > a) && (b > c) && (c > a)) {
			System.out.println(b + " " + c + " " + a);
		}
		if ((c > a) && (c > b) && (a > b)) {
			System.out.println(c + " " + a + " " + b);
		}

		if ((c > a) && (c > b) && (b > a)) {
			System.out.println(c + " " + b + " " + a);
		}

		input.close();

	}

}
