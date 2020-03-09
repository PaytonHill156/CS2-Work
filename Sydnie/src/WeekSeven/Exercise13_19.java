package WeekSeven;

//Source:
//http://soultionmanual.blogspot.com/2016/12/chapter-13-exercise-19-introduction-to.html

import java.util.Scanner;

public class Exercise13_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String s = input.next();
        System.out.println("The fractional number is " + new BigRational(s));
    }
}