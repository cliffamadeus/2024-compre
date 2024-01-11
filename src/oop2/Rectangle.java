package oop2;

public class Rectangle extends Shape{
	
	protected double l,w;
	
	protected Rectangle (double l, double w){
		this.l = l;
		this.w = w;
	}
	
	protected void showArea() {
		double area = l * w;
		
		System.out.println("The area of the rectangle is: " + area);
	}

}
