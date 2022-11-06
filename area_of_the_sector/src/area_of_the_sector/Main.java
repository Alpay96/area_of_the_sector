package area_of_the_sector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		int r = scan.nextInt();
		
		System.out.print("Enter the center angle: ");
		int a = scan.nextInt();

		double pi = 3.14;
		double area = pi * r * r * (a/360);
		System.out.println("Area: " + area);
	}
}