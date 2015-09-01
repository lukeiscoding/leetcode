package constructor;

public class job {
	public job() {
		System.out.println("nothing!");
	}

	public job(int a) {
		System.out.println("wow! " + a);
	}

	public void outter() {
		System.out.println("yeah!");
	}
}

class jobb extends job {

	public void outter() {
		super.outter();
		System.out.println("yeahyeah!");
	}
}