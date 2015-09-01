package thissuper;

import java.util.Scanner;

public class human {
	int age;
	int height;
	int weight;
	Gender gender = new Gender();
	Scanner scanner = new Scanner(System.in);

	human() {
		System.out.println("what age?");
		age = scanner.nextInt();
		System.out.println("what height?");
		height = scanner.nextInt();
		System.out.println("what weight?");
		weight = scanner.nextInt();
		if 
		gender.getGender();
	}

}

class Gender {
	boolean gen;
	Scanner scanner;
	String string = new String();

	public void getGender() {
		System.out.println("what gender?");
		scanner = new Scanner(System.in);
		this.string = scanner.nextLine();
		this.string = string.toLowerCase();
		if (string.equals("male")) {
			gen = true;
		} else if (string.equals("female")) {
			gen = false;
		} else {
			System.out.print("Wrong gender input! ");
			getGender();
		}
	}

	public String prtGender() {
		if (gen == true) {
			return "male";
		} else
			return "female";
	}
}

class man extends human{
	
}
