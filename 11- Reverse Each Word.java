/*
Probelem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120294/offering/1403016?leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String reverseEachWord(String input)
    {
        // Write your code here
        String[] inputWords = input.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<inputWords.length; i++) {
            StringBuilder reversedWord = new StringBuilder(inputWords[i]).reverse();
            result.append(reversedWord.toString()+" ");
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
