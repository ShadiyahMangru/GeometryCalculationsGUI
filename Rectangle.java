package Geometry;
public class Rectangle extends Shape{
	private int length;
	private int width;

	public Rectangle(int l, int w){
		super();
		length = l;
		width = w;
		super.setShape("Rectangle");		
	}	
	
	public void setLength(int length){
		this.length = length;	
	}
	
	public void setWidth(int width){
		this.width = width;	
	}
	
	public int getLength(){
		return length;	
	}
	
	public int getWidth(){
		return width;		
	}
	
	public String ShapeArea(){
		setArea(getLength()*getWidth());
		return "Area (sq. units) of " + super.getShape() + 
			" when length = " + this.length + " and width = " +
			this.width + ": " + super.getArea();	
	}
	
	public String ShapePerimeter(){
		setPerimeter(2*getLength() + 2*getWidth());
		return "Perimeter of " + super.getShape() + 
			" when length = " + this.length + " and width = " 
			+ this.width + ": " + super.getPerimeter();		
	}	
}