public class divisor {
	public static void divisor(int n) {
		for (int a = 1; a <= n; ++a) {
			if (n % a == 0) {
				System.out.print(a + " ");
			}
		}
	}

	public static void main(String[] args) {
		divisor(80000000);
	}
}

