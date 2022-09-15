//paragraph3
public class Circle extends Shape implements GeometricObject {
	 //3.1
    protected double radius;

    //3.2
    public Circle()
    {
        radius = 1.0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled)
    {
    	super(color,filled);
        this.radius = radius;
    }
    
    //3.3
    public double getRadius() {
		return radius;
	}
    
	public void setRadius(double radius) {
		this.radius = radius;
	}

    //3.4
    public double getArea()
    {
        return radius*2*3.14;  
    }

	public double getPerimeter()
    {
        return 2 * 3.14 *radius;
    }

    //3.5
    @Override
    public String toString()
    {
        return "A Circle with radius =" + radius +
            ", which is a subclass of" + super.toString();
    }
}
