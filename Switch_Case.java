package Zaid;

import java.util.*;

public class Switch_Case {
	public static void main(String[] args) {
		int choice, num1, num2;
		float answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition\nEnter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for Division");
		choice = sc.nextInt();
		
		switch (choice)
		{
			case 1:
					System.out.println("Enter the first number -> ");
					num1 = sc.nextInt();
					System.out.println("Enter the second number -> ");
					num2 = sc.nextInt();
					
					answer = num1 + num2;
					System.out.println("The Addition of "+ num1 + " + " + num2 + " numbers is = " + answer);
							break;
					
			case 2:
					System.out.println("Enter the first number -> ");
					num1 = sc.nextInt();
					System.out.println("Enter the second number -> ");
					num2 = sc.nextInt();
						
					answer = num1 - num2;
					System.out.println("The Substraction of "+ num1 + " - " + num2 + " numbers is = " + answer);
							break;
						
			
           case 3:
	                System.out.println("Enter the first number -> ");
	                num1 = sc.nextInt();
	                System.out.println("Enter the second number -> ");
	                num2 = sc.nextInt();
	
	                answer = num1 * num2;
	                System.out.println("The Multiplication of "+ num1 + " * " + num2 + " numbers is = " + answer);
	                		break;	
	                
	       case 4:
		             System.out.println("Enter the first number -> ");
		             num1 = sc.nextInt();
		             System.out.println("Enter the second number -> ");
		             num2 = sc.nextInt();
		
		             answer = num1 / num2;
		             System.out.println("The Division of "+ num1 + " / " + num2 + " numbers is = " + answer);
		                     break;	
		}
	}
}
