package simple.algorithms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		int first_num = 0, second_num = 1, temp, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci series till the term less than Entered Number:");
		number = sc.nextInt();
		System.out.println(first_num);
		while (second_num < number) {
			System.out.println(second_num);
			temp = second_num;
			second_num = first_num + second_num;
			first_num = temp;
		}

	}
}
