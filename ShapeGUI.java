package Geometry;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeGUI extends JFrame implements ActionListener, ItemListener, ChangeListener{
	private JFrame GeomCalc;
	
	private JRadioButton circle;
	private JRadioButton square;
	private JRadioButton rectangle;
	
	private JButton submitShape;
	private JButton submitVar;
	private JButton reset;
	
	private JLabel varType;
	private JLabel sliderPosition;
	private int sliderValue = 10; 
	
	private JLabel perimeter;
	private JLabel area;
	
	public ShapeGUI(){
		GeomCalc = new JFrame("Java is the best!");
		GeomCalc.setSize(800,800);
		GeomCalc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel ShapePanel = new JPanel();
		GeomCalc.add(ShapePanel);
		ShapePanel.setLayout(new BoxLayout(ShapePanel, BoxLayout.PAGE_AXIS));
		
		//set main title
		JLabel mainTitle = new JLabel("Geometry Calculations");
		Color grass = new Color(74, 165, 4);
		Font customFontTitle = new Font("Oslo", Font.BOLD, 40);
		mainTitle.setFont(customFontTitle);
		mainTitle.setForeground(grass);
		
		//set section headers
		JLabel h1 = new JLabel("Select A Shape: ");
		JLabel h2 = new JLabel("Assign Value(s): ");
		JLabel h3 = new JLabel("Calculations: ");
		Font customFonth = new Font("Verdana", Font.BOLD, 26);
		h1.setFont(customFonth);
		h2.setFont(customFonth);
		h3.setFont(customFonth);
		
		//set var input
		varType = new JLabel();
		varType.setFont(customFonth);
		Color watermelon = new Color(242, 29, 89);
		varType.setForeground(watermelon);
		sliderPosition = new JLabel();
		Font customSliderFont = new Font("Calibri", Font.BOLD, 44);
		sliderPosition.setFont(customSliderFont);
		Color pumpkin = new Color(234, 163, 39);
		sliderPosition.setForeground(pumpkin);
		JSlider slider = new JSlider();
        	slider.setMajorTickSpacing(10);
        	slider.setMinorTickSpacing(1);
        	slider.setPaintTicks(true);
        	slider.setPaintLabels(true);
        	slider.addChangeListener(this);
		
        	//calc results
        	Font customFontCalc = new Font("Arial", Font.BOLD, 28);
        	Color eggplant = new Color(132, 25, 120);
        	perimeter = new JLabel();
        	perimeter.setFont(customFontCalc);
        	perimeter.setForeground(eggplant);
        	area = new JLabel();
        	area.setFont(customFontCalc);
        	area.setForeground(eggplant);
        	
		//set buttons
		submitShape = new JButton("Submit");
		submitShape.addActionListener(this);
		submitVar = new JButton("Submit");
		submitVar.addActionListener(this);
		reset = new JButton("RESET");
		reset.addActionListener(this);
		Font customFontButton = new Font("Arial", Font.BOLD, 22);
		Color forest = new Color(25, 132, 82);
		Color ocean = new Color(25, 28, 132);
		submitShape.setFont(customFontButton);
		submitShape.setForeground(Color.white);
		submitShape.setBackground(forest);
		submitVar.setFont(customFontButton);
		submitVar.setForeground(Color.white);
		submitVar.setBackground(ocean);
		reset.setFont(customFontButton);
		
		//spaces
		JLabel sp1 = new JLabel("     ");	
		JLabel sp2 = new JLabel("     ");	
		JLabel sp3 = new JLabel("     ");	
		JLabel sp4 = new JLabel("     ");	
		JLabel space = new JLabel("      ");
		sp1.setFont(customFontButton);
		sp2.setFont(customFontButton);
		sp3.setFont(customFontButton);
		sp4.setFont(customFontButton);
		
		//set radio buttons to select shape
		ButtonGroup shapesSel = new ButtonGroup();
		JPanel radGrid = new JPanel();
		radGrid.setLayout(new BoxLayout(radGrid, BoxLayout.PAGE_AXIS));
		
		Font customFontShape = new Font("Oslo", Font.BOLD, 22);
		Color pink = new Color(244, 66, 206);
		Color purple = new Color(113, 60, 163);
		Color bl = new Color(11, 129, 232);
		
		circle = new JRadioButton("CIRCLE");
		circle.setFont(customFontShape);
		circle.setForeground(pink);
		shapesSel.add(circle);
		circle.addItemListener(this);
		radGrid.add(circle);
		square = new JRadioButton("SQUARE");
		square.setFont(customFontShape);
		square.setForeground(purple);
		shapesSel.add(square);
		square.addItemListener(this);
		radGrid.add(square);
		rectangle = new JRadioButton("RECTANGLE");
		rectangle.setFont(customFontShape);
		rectangle.setForeground(bl);
		shapesSel.add(rectangle);
		rectangle.addItemListener(this);
		radGrid.add(rectangle);
		
		//window layout
		ShapePanel.add(mainTitle);
		ShapePanel.add(sp1);
		ShapePanel.add(h1);
		ShapePanel.add(radGrid);
		ShapePanel.add(submitShape);
		ShapePanel.add(sp2);
		ShapePanel.add(h2);
		ShapePanel.add(space);
		ShapePanel.add(varType);
		ShapePanel.add(sliderPosition);
		ShapePanel.add(slider);
		ShapePanel.add(submitVar);
		ShapePanel.add(sp3);
		ShapePanel.add(h3);
		ShapePanel.add(perimeter);
		ShapePanel.add(area);
		ShapePanel.add(sp4);
		ShapePanel.add(reset);
		GeomCalc.setVisible(true);
	}
		
	      private int choice; 
	      public void itemStateChanged(ItemEvent eventRad){
        		if(eventRad.getItemSelectable()==circle){
        			choice = 1;
        		}
        		else if(eventRad.getItemSelectable()==square){
        			choice = 2;
        		}
        		else if(eventRad.getItemSelectable()==rectangle){
        			choice = 3;
        		}
        	}
        	
        	//code to help retrieve two different slider values w/rectangle choice
        	private int c=0;
        	private int d = 0;
        	private int sliderValueLength;
        	private int sliderValueWidth;
        	public int getSliderValueLength(){
        		return sliderValueLength;	
        	}
        	public void setSliderValueLength(int len){
        		sliderValueLength = len;	
        	}
        	public int getSliderValueWidth(){
        		return sliderValueWidth;	
        	}
        	public void setSliderValueWidth(int w){
        		sliderValueWidth = w;
        	}
        	
        	

        	public void actionPerformed(ActionEvent event){
        		JButton source = (JButton)event.getSource();
        		if(source.equals(submitShape)){
				switch(choice){
					case 1: varToGet("Use slider to select radius of CIRCLE");
						break;
					case 2: varToGet("Use slider to select side-length of SQUARE");
						break;
					case 3: varToGet("Use slider to select length of RECTANGLE");
						break;
				}
        		}
        		if(source.equals(submitVar)){
        			switch(choice){
					case 1: Shape circ = new Circle(sliderValue);	
						perimeter.setText(circ.ShapePerimeter());
						area.setText(circ.ShapeArea());
						break;
					case 2: Shape sq = new Square(sliderValue);
						perimeter.setText(sq.ShapePerimeter());
						area.setText(sq.ShapeArea());
						break;
					case 3: 
						d++;
						if(d==1){
							varToGet("Use slider to select width of RECTANGLE");	
						}
						if(c==2){
							Shape r = new Rectangle(getSliderValueLength(), getSliderValueWidth());
							perimeter.setText(r.ShapePerimeter());
							area.setText(r.ShapeArea());
						}
						break;
					}
        		}
        		if(source.equals(reset)){
        			GeomCalc.dispose();
        			ShapeGUI another = new ShapeGUI();
        		}
        	}
        	
        	public void stateChanged(ChangeEvent e) {
        		sliderValue = ((JSlider)e.getSource()).getValue();
        		sliderPosition.setText("Your selection: " + sliderValue);
        		if(choice==3 & d==0){
        			sliderValueLength = this.sliderValue;
        		}
        		else{
        			setSliderValueWidth(sliderValue);
        			c=2;
        		}
        	} 
        	
        	public void varToGet(String var){
        		varType.setText(var);
        	}
        	
        	public static void main(String[] args){
        		ShapeGUI createInst = new ShapeGUI();
		}
	}