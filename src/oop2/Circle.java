package oop2;

public class Circle extends Shape{
	
	protected double r;
	
	protected Circle (double r){
		this.r = r;
	}
	
	protected void showArea() {
		double area = 2 * Math.PI * r;
		
		System.out.println("The area of the circle is: " + area);
	}

}
