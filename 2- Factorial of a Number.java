/*
Problem Statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459172
*/

import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial=1;
        
        if(number==0){
            System.out.println(1);
        }    
        else if(number<0){
            System.out.println("Error");
        }
        else {
            for(int i=1; i<=number; i++) {
                factorial=factorial*i;
            //    System.out.println("Now factorial is: "+factorial);
            }
            System.out.println(factorial);
        }

		
	}
}
