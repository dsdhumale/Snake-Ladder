package snakeLadderUC;

public class SnakeLadderUC3 {
	public static void main(String[] args) {
		int player = 0;
		System.out.println("Start The Game");

		int optionCheck = (int) (Math.random() * 3) + 1;
		int dicecheck = (int) (Math.random() * 6) + 1;
		if (optionCheck == 1) {
			System.out.println("No play");
		} else if (optionCheck == 2) {
			player += dicecheck;
			System.out.println("Ladder !!! player position is " + player);
		} else if (optionCheck == 3) {
			player -= dicecheck;
			System.out.println("Snake !!! player position is " + player);
		}
	}
}