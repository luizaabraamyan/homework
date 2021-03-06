import java.util.Scanner;

public class HoursOfTheDay {

	public static void main(String[] args) {
		int hour;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter hour of the day [0 ... 24]: ");
			hour = input.nextInt();
			if (hour < 0 || hour > 24) {
				System.out.println("Invalid hour!");
			}
		} while (hour < 0 || hour > 24);

		if (hour >= 4 && hour <= 9) {
			System.out.println("Good morning!");
		}

		if (hour > 9 && hour <= 18) {
			System.out.println("Good day!");
		}

		if (hour > 18 || hour < 4) {
			System.out.println("Good evening!");
		}

		input.close();

	}

}
