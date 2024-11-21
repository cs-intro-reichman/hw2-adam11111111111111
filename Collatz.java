// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int step;
		int temp;
		if (mode.equals("v")) {
			System.out.println("1 4 2 1 (4)");
			for (int i = 2; i <= seed; i++) {
				step = 1;
				temp = i;
				System.out.print(temp + " ");
				while (temp != 1) {
					if (temp % 2 == 0) {
						temp = temp / 2;
						System.out.print(temp + " ");

					} else {
						temp = (temp * 3) + 1;
						System.out.print(temp + " ");
					}
					step++;
				}
				System.out.println("(" + step + ")");
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		} else if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}

	}
}
