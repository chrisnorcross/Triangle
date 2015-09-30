package MainPackage;

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	/**
	 * The no argument constructor
	 */
	public Triangle() {
		super();
	}
	/**
	 * Constructor for triangle
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public  Triangle(double side1,double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/**
	 * Getter for side 1
	 * @return this.side1 
	 */
	public double getSide1(){
		return this.side1;
	}
	/**
	 * Getter for side2
	 * @return this.side2
	 */
	public double getSide2(){
		return this.side2;
	}
	/**
	 * Getter for side3
	 * @return this.side3
	 */
	public double getSide3(){
		return this.side3;
	}
	/**
	 * Calculates the area of the triangle
	 * @return area
	 */
	@Override
	public double getArea() {
		double s = .5* (side1+side2+side3);
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	/**
	 * Calculates the perimeter of the triangle
	 * @return per The perimeter of the triangle
	 */
	@Override
	public double getPerimeter() {
		double per = side1+side2+side3;
		return per;
	}
	/**
	 * Describes the triangle as a string
	 * @return side1, side2, side3, area, and perimeter
	 */
	public String toString(){
		return("Side1 is "+side1+"\nSide2 is "+side2+"\nSide3 is"+side3+
				"\nArea is "+ this.getArea()+ "\nPerimeter is "+this.getPerimeter());
	}

}
