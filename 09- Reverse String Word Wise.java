/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403013?leftPanelTab=0
*/

import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
            // Write your code here
         String[] inputWords = input.split(" ");
         StringBuilder result = new StringBuilder();
         
         for(int i=inputWords.length-1; i>=0; i--) {
             result.append(inputWords[i]+" ");
             }
         return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
