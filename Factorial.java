package Zaid;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of which you want the factorial of-> ");
		number = sc.nextInt();
		
		int i,factorial;
		factorial = 1;
		for (i=number;i>=1;i--)
		{
			factorial = factorial * i;
		}
		System.out.println("The factorial of the number "+ number +" is "+ factorial);
	}
}
