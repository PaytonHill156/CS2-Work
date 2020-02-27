package WeekSix;

public class Triangle extends GeometricObject{

	/* -side1: double
	 * -side2: double
	 * -side3: double
	 * 
	 * 
	 * +Triangle()
	 * +Triangle(side1: double, side2: double, side3: double)
	 * +getSide1() : double
	 * +setSide1(side1: double) : void 
	 * +getSide2() : double
	 * +setSide2(side2: double) : void
	 * +getSide3() : double
	 * +setSide3(side3: double) : void
	 * +getPerimeter() : double
	 * +getArea() : double 
	 * +toString() : String
	 */
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		this.setSide1(1.0);
		this.setSide2(1.0);
		this.setSide3(1.0);

	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	//Area=SQRT(s(s-a)(s-b)(s-c))
	public double getArea() {
		double s = getPerimeter() / 2;
		double area = Math.sqrt((s * (s-this.side1) * (s - this.side2) * (s - this.side3)));
		return area;
	}
	
	public String toString() {
		String description = super.toString() + "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
		return description;
	}
	
	
	
	
	
	
}
