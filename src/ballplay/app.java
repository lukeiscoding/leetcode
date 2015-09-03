package ballplay;

import java.util.Random;

public class app {

	public static void main(String[] args) {
		player a = new player();
		player b = new player(2.0/3.0);
		int c = 99999999;
		playball playball = new playball();
		playball.play(a, b, c);
		playball.score(a, b);
	}

}
