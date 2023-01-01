/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120303/offering/1403162?leftPanelTab=0
*/

import java.util.Scanner;

class ComplexNumbers {
	//instance variable
	int realPart;
	int imaginaryPart;
	
	//parameterized constructor
	public ComplexNumbers(int realPart, int imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	//instance method SUM
	String plus(ComplexNumbers obj) {
		int realSum = this.realPart + obj.realPart;
		int imaginarySum = this.imaginaryPart + obj.imaginaryPart;
		String resultSum = realSum+" "+"+"+" "+"i"+imaginarySum;
		return resultSum;
	}
	
	//instance method MULYIPLY: z1*z2 = (ac – bd) + i(ad + bc)
	String multiply(ComplexNumbers obj) {
		int realMultiply = (this.realPart*obj.realPart)-(this.imaginaryPart*obj.imaginaryPart);
		int imaginaryMultiply = (this.realPart*obj.imaginaryPart)+(this.imaginaryPart*obj.realPart);
		String resultMultiply = realMultiply+" "+"+"+" "+"i"+imaginaryMultiply;
		return resultMultiply;
	}
	
}//class


public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R1 = scanner.nextInt();
		int I1 = scanner.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(R1, I1);
		int R2 = scanner.nextInt();
		int I2 = scanner.nextInt();
		ComplexNumbers c2 = new ComplexNumbers(R2, I2);	
		
		int operation = scanner.nextInt();
		if(operation==1) {
			System.out.println(c1.plus(c2));
		}
		else if(operation==2){
			System.out.println(c1.multiply(c2));
		}
		
	}//main
}//class
