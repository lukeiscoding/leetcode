package ballplay;

import java.util.Random;

import javax.xml.transform.Templates;

public class playball {
	static int lop = 0;
	Random random = new Random();

	public void play(player pb, player pa, int loop) {
		while (lop < loop) {
			if (play(pa)) {
				pa.score = pa.score + pa.goal;
				lop = lop + 1;
				player temp = pa;
				pa = pb;
				pb = temp;
			} else {
				if (random.nextBoolean()) {
					player temp = pa;
					pa = pb;
					pb = temp;
				}
			}
		}
	}

	private boolean play(player aPlayer) {
		if (random.nextDouble() < aPlayer.acc) {
			return true;
		} else
			return false;
	}

	public void score(player pa, player pb) {
		System.out.println("score a = " + pa.score + " " + pa.goal);
		System.out.println("score b = " + pb.score + " " + pb.goal);
		System.out.println("total = " + ((double) pb.score / (double) pa.score));
	}
}
