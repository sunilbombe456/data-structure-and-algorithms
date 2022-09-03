package simple.algorithms;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

}
