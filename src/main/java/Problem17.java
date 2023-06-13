//Question 17
// Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//Input: Civic
//Output: true
//Input: One
//Output: false

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = input.next().toLowerCase();
        isPalindrome(myStr);

    }

    public static void isPalindrome(String myStr) {
        char[] myChar = myStr.toCharArray();
        String rev = "";
        int j = 0;

        for (int i = myChar.length - 1; i >= 0; i--) {
            rev += myChar[i];
        }

        System.out.println("Reverse of input is: "+rev);

        if(myStr.equals(rev)){
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not palindrome!");
        }
    }

}
