package ballplay;

public class player {
	double acc = 1.0;
	int score = 0;
	int goal = 0;

	public player() {
		goal = 2;
	}

	public player(double chance) {
		acc = chance;
		goal = 3;
	}
}
