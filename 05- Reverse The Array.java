/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459176?leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;


public class Solution 
{
        public static void reverseArray(ArrayList<Integer> originalArray, int swappingPoint)
        {
            int leftItem =swappingPoint+1; //swapping point is not included
            int rightItem=originalArray.size()-1; //indices are zero based 
           
            while(leftItem <rightItem){
                   Collections.swap(originalArray,leftItem ,rightItem);
                leftItem ++;
                rightItem--;
            }
           
        }
    
    
}//calss
