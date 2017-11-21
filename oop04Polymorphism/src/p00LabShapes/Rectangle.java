package p00LabShapes;

public class Rectangle extends Shape{

	private double height;
	private double width;
	
	
	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		this.setPerimeter(calculatePerimeter());
		this.setArea(calculateArea());
	}

	@Override
	protected double calculatePerimeter() {
		return this.height * 2 + this.width * 2;
	}

	@Override
	protected double calculateArea() {
		return this.height * this.width;
	}

	public final double getHeight() {
		return this.height;
	}
	public final double getWidth() {
		return this.width;
	}
}
