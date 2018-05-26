package Geometry;
public class Circle extends Shape{
	private int radius;

	public Circle(int r){
		super();
		radius = r;
		super.setShape("Circle");	
	}	
	
	public void setRadius(int radius){
		this.radius = radius;	
	}
	
	public int getRadius(){
		return radius;	
	}
	
	public String ShapeArea(){
		setArea((3.14)*getRadius()*getRadius());
		return "Area (sq. units) of " + super.getShape() + 
			" when radius = " + this.radius + ": " + super.getArea();	
	}
	
	//circumference
	public String ShapePerimeter(){
		setPerimeter(2*(3.14)*getRadius());
		return "Circumference of " + super.getShape() + 
			" when radius = " + this.radius + ": " + super.getPerimeter();	
	}
}