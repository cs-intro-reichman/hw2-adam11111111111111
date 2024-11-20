// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double temp = 3;
		double count = 1;
		boolean sign = true;
		for (int i = 1; i < num; i++) {
			if (sign) {
				count = count - (1 / temp);
				sign = false;
			} else {
				count = count + (1 / temp);
				sign = true;
			}
			temp = temp + 2;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + count * 4);

	}
}
