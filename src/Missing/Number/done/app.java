package Missing.Number.done;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		System.out.println("Start Now");
		int[] number = { 1, 2 };
		Solution solution = new Solution();
		int missingNumber = solution.missingNumber(number);
		System.out.println("missing number is " + missingNumber);
	}

}
