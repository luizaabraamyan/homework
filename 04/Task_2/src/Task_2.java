import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the matrix: ");
		int size = input.nextInt();
		int[][] twoDimArr = new int[size][size];

		for (int row = 0; row < twoDimArr.length; row++) {
			for (int col = 0; col < twoDimArr[0].length; col++) {
				System.out.println("Enter [" + row + "]" + "[" + col + "]");
				twoDimArr[row][col] = input.nextInt();

			}
		}

		System.out.print("First diagonal: ");
		for (int r1 = 0, c1 = 0; r1 < twoDimArr.length && c1 < twoDimArr[0].length; r1++, c1++) {
			System.out.print(twoDimArr[r1][c1] + " ");
		}
		System.out.println();

		System.out.print("Second diagonal: ");
		for (int r2 = 0, c2 = twoDimArr[0].length - 1; r2 < twoDimArr.length && c2 >= 0; r2++, c2--) {
			System.out.print(twoDimArr[r2][c2] + " ");
		}

		input.close();

	}

}
