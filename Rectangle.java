//paragraph3
public class Rectangle extends Shape implements GeometricObject {
	// 3.6
	protected double width;
	protected double height;

	// 3.7
	public Rectangle() {
		width = 1.0;
		height = 1.0;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	// 3.8
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 3.9
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return width * 2 + height * 2;
	}

	// 3.10
	@Override
	public String toString() {
		return "A Rectangle with width =" + width + "and length =" + height
				+ ", which is a subclass of " + super.toString();
	}
}
