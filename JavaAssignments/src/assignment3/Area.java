package assignment3;

public class Area extends Shape{

	
	void RectangleArea(int length, int breadth) {
		super.print((length*breadth),"Rectangle");
		
	}

	void SquareArea(int side) {
		super.print((side*side), "Square");
		
	}

	void CircleArea(double radius) {
		super.print((Math.PI*radius*radius), "Circle");
		
	}
	
	public static void main(String[] args) {
		Area shape = new Area();
		shape.RectangleArea(4, 5);
		shape.SquareArea(5);
		shape.CircleArea(10);
	}

}
