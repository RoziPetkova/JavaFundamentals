package p00LabShapes;

public class Circle extends Shape {

	private double radius;
	
	Circle(double radius) {
		this.radius = radius;
		this.setPerimeter(calculatePerimeter());
		this.setArea(calculateArea());
	}

	@Override
	protected double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	protected double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public final double getRadius() {
		return this.radius;
	}

}
