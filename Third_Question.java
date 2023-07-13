package Zaid;

import java.util.*;

public class Third_Question {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age. ");
		age = sc.nextInt();
		
		if(age < 18)
		{
			System.out.println("You are not Eligible");
		}
		else
		{
			System.out.println("You are Eligible");
		}
		
	}
}
