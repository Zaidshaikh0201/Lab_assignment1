package Zaid;

import java.util.*;

public class Switch_Case {
	public static void main(String[] args) {
		int n1,n2,choice1,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose The Operator:\n\n1.Arithmetic"
				+ "\n2.Bitwise\n3.Assignment\n4.Ternary\n5.Relational");
		System.out.print("Your Choosen Opertor: ");
	   
		choice1=sc.nextInt();
		
		      //Using Switch 
		switch(choice1) {
		
		     //Arithmetic Operation
		case 1:
			   System.out.println("Enter two No's:");
			   n1=sc.nextInt();
			   n2=sc.nextInt();
			   
			   System.out.println("Addition of the Two Numbers is  "+(n1+n2));
			   System.out.println("Subtraction of the Two Numbers is  "+(n1-n2));
			   System.out.println("Multiplication of the Two Numbers is  "+(n1*n2));
			   System.out.println("Divison of the Two Numbers is  "+(n1/n2));
			   System.out.println("MOD of the Two Numbers is  "+(n1%n2));
			   break;
			   
			 //Bitwise Operation
		case 2:
			System.out.println("\nEnter two No's: ");
			n1=sc.nextInt();
			n2=sc.nextInt();
			System.out.println("The Bitwise And is: "+(n1&n2));
			
			System.out.println("The Bitwise OR is: "+(n1|n2));
			break;
			
			//Assignment Operation
		case 3:
			System.out.println("Enter two No's: ");
			n1=sc.nextInt();
			n2=sc.nextInt();
			
			n1+=n2 ;//Addition
			System.out.println("The += Answer is: "+n1);
			n1-=n2 ;//Subtraction
			System.out.println("The -= Answer is: "+n1);
			n1*=n2 ;//Multiplication
			System.out.println("The *= Answer is: "+n1);
		    n1/=n2 ;//Division
			System.out.println("The /= Answer is: "+n1);
			n1%=n2 ;//Modulus
			System.out.println("The %= Answer is: "+n1);
			break;
			
			//Ternary Operation
		case 4:
			System.out.println("Enter two No's: ");
			n1=sc.nextInt();
			n2=sc.nextInt();
			
			min=(n1<n2)?n1:n2;//Comparing to get minimum of the input value  
			System.out.println("The Minimum No is: "+min);
			break;
			
			//Relational Operation
		case 5:
			System.out.println("Enter two No's: ");
			n1=sc.nextInt();
			n2=sc.nextInt();
			System.out.println("‘Equal to’ operation: "+ (n1 == n2));//Equal to
			System.out.println("'Not equal to' Operation: " + (n1 != n2));//Not equal to
			System.out.println("‘Greater than’ operation: " + (n1 > n2));//Greater than
			System.out.println("‘Less than’ Operation: " + (n1 < n2));//Less than
			System.out.println("'Greater than or equal to' Operation: " + (n1 >= n2));//Greater than or equal to
			System.out.println("'Less than or equal to' Operation: "+ (n1 <= n2));//Less than or equal to	
			break;
				
		}
		

	}

}
	
}

/*
package Zaid;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number-> ");
		num1 = sc.nextInt();
		
		if (num1 % 2 == 0)
		{
			System.out.print("The Number is positive");
		}
		else
		{
			System.out.print("The Number is negative");
		}
		
		
		
		
	}
}*/


/*
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

*/ 


