/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120303/offering/1403512
*/

import java.util.Scanner;

class Person {
	// instance variables
	private String name;
	private int age;
	
	//getters and setters
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
	
	// constructor
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
			System.out.println("The name of the person is "+name+" and the age is "+age+".");
		}
}


public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		Person person = new Person(name, age);
	
	}//main
}//class
