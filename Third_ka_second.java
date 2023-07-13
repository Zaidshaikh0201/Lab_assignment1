package Zaid;

import java.util.*;

public class Third_ka_second {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number-> ");
		num1 = sc.nextInt();
		System.out.print("Enter the second number-> ");
		num2 = sc.nextInt();
		System.out.print("Enter the third number-> ");
		num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1 +" is the greatest");
		}
		if (num2>num1 && num2>num3)
		{
			System.out.println(num2 +" is the greatest");
		}
		if (num3>num2 && num3>num1)
		{
			System.out.println(num3 +" is the greatest");
		}
	}
}
