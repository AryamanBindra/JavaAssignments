package assignment3;


abstract public class Shape {
	//RectangleArea', 'SquareArea' and 'CircleArea
	
	abstract void RectangleArea(int length, int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(double radius);
	
	void print(double area, String type) {
		System.out.println("Area of the "+type
				+" is: "+area);
	}

}
