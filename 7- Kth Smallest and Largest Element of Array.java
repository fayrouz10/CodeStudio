/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459179?leftPanelTab=0
*/

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        Collections.sort(arr);
        int kthSmallest = arr.get(k-1);
        int kthLargest = arr.get(n-k);
        
        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(kthSmallest);
        resultArray.add(kthLargest);

        return resultArray;
    }
  

}//class
