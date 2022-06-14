package com.simplilearn.org;

public class Dog {
	
	public static int count = 0;
	
	private String name;
	private int age;

	
	
	//Constructor
	public Dog() {
		super();
	}

	
	//getters and setters
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Dog.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//Parameterised Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count +=1;
		Dog.display();
		this.display2();
		
	}
	
	public void display2() {
		System.out.println(("I am a dog"));
	}
	
	public static void display() {
		System.out.println("You are the dog");
	}
	
	
	
	

}
