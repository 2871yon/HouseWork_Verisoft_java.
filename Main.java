
public class Main {
    //test paragraph
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //p1+2
        Circle c = new Circle(5, "pink", true);
        Circle c1 = new Circle(5);
        Circle c2 = new Circle();
        Shape sc = new Circle(5, "pink", true);
        Shape sc1 = new Circle(4);
       
        //p1+3
        Rectangle r = new Rectangle(10, 20, "yellow", false);
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);
        Shape sr = new Rectangle(10, 20, "yellow", false);
        Shape sr1 = new Rectangle(4,4);  
        
        //p1+2+3
        Shape[] shapeArr=new Shape[10];
        shapeArr[0]=c;
        shapeArr[1]=c1;
        shapeArr[2] = c2;
        shapeArr[3]=sc;
        shapeArr[4] = sc1;
        shapeArr[5] = r;
        shapeArr[6] = r1;
        shapeArr[7] = r2;
        shapeArr[8] = sr;
        shapeArr[9] = sr1;

        for (int i = 0; i < shapeArr.length; i++)
        {
            if(shapeArr[i] != null) 
            System.out.println("shape " + i +": "+shapeArr[i].toString());

            if (shapeArr[i] instanceof GeometricObject)
            {
            	System.out.println((shapeArr[5]));
            	
            	System.out.println("Perimeter: " +((GeometricObject) (shapeArr[i])).getPerimeter());
            	System.out.println("Area: " +((GeometricObject)(shapeArr[i])).getArea()+ "\n\r");
            }
        }
	}

}
