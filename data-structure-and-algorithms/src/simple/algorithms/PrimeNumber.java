package simple.algorithms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		int n, remainder;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = sc.nextInt();
		flag = false;
		int divider = 2;
		while (divider < n) {
			remainder = n % divider;
			if (remainder == 0) {
				flag = true;
				break;
			} else {
				divider += 1;
			}
		}
		if (flag) {
			System.out.println("Number is Not Prime!");
		} else {
			System.out.println("Number is Prime!");
		}
	}
}
