package Zaid;

import java.util.*;

public class ACandDC {
	public static void main(String[] args) {
		
		int radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius = ");
		radius = sc.nextInt();
		
		float Area_of_Circle, Circumference_of_Circle;
		
		Area_of_Circle = (22/7) * radius * radius;
		Circumference_of_Circle = 2 * (22/7) * radius;
		
		System.out.println("Area of Circle = " + Area_of_Circle);
		System.out.println("Circumference of Circle = " + Circumference_of_Circle);
	}
}
