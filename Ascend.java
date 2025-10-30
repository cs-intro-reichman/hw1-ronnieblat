// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*(lim-0+1));
		int b = (int)(Math.random()*(lim-0+1));
		int c = (int)(Math.random()*(lim-0+1));
		int minimum = Math.min(a,Math.min(b, c));
		int maximum = Math.max(a, Math.max(b, c));
		int middle = a+b+c-minimum-maximum;
		System.out.println(minimum + " " + middle + " " + maximum);

	}
}
