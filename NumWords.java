// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int ones= num%10;
		num=num/10;
		int tens=num%10;
		num=num/10;
		int hundreds=num%10;
		System.out.println(hundreds + " hundrends, " + tens + " tens, and " + ones + " ones.");
	}
}
