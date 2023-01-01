/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403012?leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
   static void printSubstrings(String input) {
        // Write your code here
        for(int i=0; i<input.length(); i++) {
        // substringLength should be always i+1
            for(int substringLength = i+1; substringLength<=input.length();substringLength++) {
                System.out.println(input.substring(i,substringLength));
            }
        }
    }
    
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
