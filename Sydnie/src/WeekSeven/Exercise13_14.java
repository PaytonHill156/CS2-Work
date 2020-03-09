package WeekSeven;

//Source: 
//http://soultionmanual.blogspot.com/2016/12/chapter-13-exercise-14-introduction-to.html

public class Exercise13_14 {

	public static void main(String[] args) {

		Rational rational = new Rational(4, 10);
		rational = rational.multiply(new Rational(2, 4));
		System.out.println(rational);
	}
}