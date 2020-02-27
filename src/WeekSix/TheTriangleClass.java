package WeekSix;

import java.util.Scanner;

public class TheTriangleClass {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		System.out.println("Please enter the length of the sides of your triangle:");
		System.out.println("Side1: ");
		triangle.setSide1(keyInput.nextDouble());
		System.out.println("Side2: ");
		triangle.setSide2(keyInput.nextDouble());
		System.out.println("Side3: ");
		triangle.setSide3(keyInput.nextDouble());
		
		System.out.println("What color is your triangle?");
		triangle.setColor(keyInput.next());
		
		System.out.println("Is your triangle filled?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int filled = keyInput.nextInt();
		if(filled == 1) {
			triangle.setFilled(true);
		}else {
			triangle.setFilled(false);
		}
		
		keyInput.close();
		
		System.out.println("The perimeter of your triangle is: " + triangle.getPerimeter());
		System.out.println("The area of your triangle is: " + triangle.getArea());
		System.out.println(triangle.toString());
		

	}

}
