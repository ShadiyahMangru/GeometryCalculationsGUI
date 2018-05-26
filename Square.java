package Geometry;
public class Square extends Shape{
	private int side;

	public Square(int s){
		super();
		side = s;
		super.setShape("Square");	
	}	
	
	public void setSide(int side){
		this.side = side;	
	}
	
	public int getSide(){
		return side;	
	}
	
	public String ShapeArea(){
		setArea(getSide()*getSide());
		return "Area (sq. units) of " + 
			super.getShape() + " when side = " + 
			this.side + ": " + super.getArea();	
	}
	
	public String ShapePerimeter(){
		setPerimeter(4*getSide());
		return "Perimeter of " + 
			super.getShape() + " when side = " + 
			this.side + ": " + super.getPerimeter();	
	}
}