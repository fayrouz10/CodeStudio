/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120303/offering/1469230?leftPanelTab=0
*/

import java.util.Scanner;

class Sqaure {
	//instance variable
	int length;
	
	//default constructor
		public Sqaure() {
			this.length = 10;
		}
	
	//parameterized constructor
	public Sqaure(int length) {
		this.length = length;
	}
	
	//instance method printArea
	int printArea(Sqaure obj) {
		int area= obj.length*obj.length;
		return area;
	}
	
}//class


public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sqaure s1 = new Sqaure();
		System.out.println(s1.printArea(s1));
		Sqaure s2 = new Sqaure(7);
		System.out.println(s2.printArea(s2));
		
	}//main
}//class
