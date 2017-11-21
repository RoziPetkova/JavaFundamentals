package p00LabShapes;

public abstract class Shape {

		private double perimeter;
		private double area;
		
		public Double getPerimeter() { return this.perimeter; }
		public Double getArea() { return this.area; }
		public void setPerimeter(Double perimeter) { this.perimeter = perimeter;}
		public void setArea(Double perimeter) { this.area = perimeter;}		
		
		protected abstract double calculatePerimeter();
		protected abstract double calculateArea();
}
