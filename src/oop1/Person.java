package oop1;

public class Person {
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showName() {
		System.out.print("Hello there! My name is " + name);
	}
	
	void showAge() {
		System.out.println(" and I am " + age + " years old");
	}
}
