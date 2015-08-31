package Ugly.Number.done;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please key in a number! No character!");
		int num = scanner.nextInt();
		boolean ugly = solution.isUgly(num);
		System.out.println("is ugly? " + ugly);
	}
}