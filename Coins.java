/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int quarters = 25;
		int money = Integer.parseInt(args[0]);
		int a = money/quarters;
		int b = money%quarters;
		System.out.println("Use " + a + " quarters and " + b + " cents ");

	}
}
