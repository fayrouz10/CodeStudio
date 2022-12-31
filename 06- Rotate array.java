/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459177?leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        
        /*store the original ArrayList*/
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<arraySize; i++) {
            arr.add(scanner.nextInt());
        }
        
        /*rotate the ArrayList*/
        int rotationTimes = scanner.nextInt();
        for(int i=0; i<rotationTimes; i++) {
            //get the first item in the ArrayList
            int firstItem = arr.get(0);
            //remove the first item from the beginning of the ArrayList
            arr.remove(arr.get(0));
            //add the first item to the end of the array
            arr.add(firstItem);
        }
        
        /*show the ArrayList*/
        for(int item:arr) {
            System.out.print(item+" ");
        }
            
        
            
		
	}
}
