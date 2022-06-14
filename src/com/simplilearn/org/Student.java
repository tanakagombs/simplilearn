package com.simplilearn.org;

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	
	//Constructor
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	public Student() {
		super();
	}



	public String getName() {
		return name;
	}


// void because its just supposed to set the name not return the name
	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	public static void main(String[] args) {
		
		Student john = new Student("Jay", 20, "Rando shit");
		
		System.out.println(john);
	}
	

}
