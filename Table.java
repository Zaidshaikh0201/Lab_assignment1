package Zaid;

import java.util.*;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number of your choice -> ");
		number = sc.nextInt();
		
		int i, sum;
		sum = 0;
		for (i=1;i<=10;i++)
		{
			sum = number * i;
			System.out.println(number + " * " + i + " = " + sum);
		}
				
	}
}
