/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403017?leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

   static String removeAllOccurrencesOfChar(String input, char c) {
            // Write your code here
          StringBuilder result = new StringBuilder();
          for(int i=0; i<input.length(); i++) {
              char checkedChar = input.charAt(i);
              if(checkedChar!=c) {
                  result.append(checkedChar);
              }
          }
          return result.toString();
        }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}
