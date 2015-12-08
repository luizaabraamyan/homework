import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		boolean isMirrored = false;

		for (int i = 0; i < len; i++) {
			System.out.println("Enter [" + i + "]");
			arr[i] = input.nextInt();
		}

		if (len == 1) {
			isMirrored = true;
		}

		for (int j = 0, e = len - 1; j < len / 2 && e >= len / 2; j++, e--) {
			if (arr[j] == arr[e]) {
				isMirrored = true;
			}
		}

		if (isMirrored) {
			System.out.println("The array is mirrored.");
		}

		else {
			System.out.println("The array is not mirrored.");
		}
		input.close();

	}

}
