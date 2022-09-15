//paragraph2
public abstract class Shape {
	// 2.1
	protected String color;
	protected boolean filled;
	
	//2.2
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//2.3
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString()
	{
		if (filled)
            return"A Shape with: " + color + ", of filled.";
        else
            return "A Shape with: " + color + ", of Not filled.";
        	}
	
}
