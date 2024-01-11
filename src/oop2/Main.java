package oop2;

public class Main {

	public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		shape1.shape();
		
		Circle circle1 = new Circle (2);
		circle1.shape();
		circle1.showArea();
		
		Rectangle rectangle1 = new Rectangle (1,2);
		rectangle1.shape();
		rectangle1.showArea();

	}

}
