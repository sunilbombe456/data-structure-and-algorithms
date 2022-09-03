package simple.algorithms;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[]) {
		int  n, factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		n = sc.nextInt();
		while (n > 0) {
			factorial *= n;
			n = n - 1;
		}
		System.out.println("Factorial is: " + factorial);
	}
}
