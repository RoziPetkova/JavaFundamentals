package classBox;

public class Box {

	private Double length;
	private Double width;
	private Double height;
	
	public Box(Double length, Double width, Double height) {
		this.setHeight(height);
		this.setLength(length);
		this.setWidth(width);
	}


	private void setLength(Double length) {
		if (length <= 0.0)
			throw new IllegalArgumentException("Length cannot be zero or negative.");
		this.length = length;
	}

	
	private void setWidth(Double width) {
		if (width <= 0.0)
			throw new IllegalArgumentException("Width cannot be zero or negative.");
		this.width = width;
	}

	private void setHeight(Double height) {
		if (height <= 0.0)
			throw new IllegalArgumentException("Height cannot be zero or negative.");
		this.height = height;
	}

	public Double surfaceArea() {
		return (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height);
	}

	public Double lateralSurfaceArea() {
		return (2 * this.length * this.height) + (2 * this.width * this.height);
	}

	public Double Volume() {
		return this.length * this.width * this.height;
	}
}
