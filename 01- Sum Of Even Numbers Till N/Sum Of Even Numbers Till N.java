/*
Problem statement:
https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459169
*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static long evenSumTillN(int number) {
		// Write your code here.
        long nearestEvenNumber = number%2==0? number:number-1;
        long positionOfNearestEvenNumber = nearestEvenNumber/2;
        long sumOfEvenNumbersTillN = positionOfNearestEvenNumber*(positionOfNearestEvenNumber+1);
        return sumOfEvenNumbersTillN;
	}
}
