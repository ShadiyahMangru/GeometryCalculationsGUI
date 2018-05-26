package Geometry;
public class Shape{
	private String shape;
	private double area;
	private double perimeter;

	public void setShape(String shape){
		this.shape = shape;	
	}

	public void setArea(double area){
		this.area = area;		
	}
	
	public void setPerimeter(double perimeter){
		this.perimeter = perimeter;	
	}
	
	public String getShape(){
		return shape.toUpperCase();	
	}

	public double getArea(){
		return area;		
	}
	
	public double getPerimeter(){
		return perimeter;		
	}
		
	public String ShapeArea(){
		return "ack, which area formula do i use???";	
	}
	
	public String ShapePerimeter(){
		return "ack, which perimeter/circumference formula do i use???";
	}
}