/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120298/offering/1404438?leftPanelTab=0
*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here
     public static int totalPrime(int start, int end){
            int counter = 0;
            for (int i = start; i<=end; i++) {
             boolean flag = false;
              for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
                if (flag==false){
                    counter++;
                }
            }
            return counter;
     }
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			
