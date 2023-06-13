//Question - 18
//Write a program that will take integer numbers as user input continuously and print the sum of numbers until
// user input q from the keyboard. When user input q, program will be quit. If user inputs another character,
// then the program will ask to input the number again.

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        int sum = 0;

        boolean flag = true;
        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nPlease enter an integer number: ");

            String number = input.next();
            char c = number.toCharArray()[0];
            if (number.equals("q")) {
                break;
            }
            else if (Character.getNumericValue(c)>=10) {  // a = 10, b = 11...
                //System.out.println("Please enter an Integer ");
            }
            else {
                int num = Integer.parseInt(number);
                sum = sum + num;
                System.out.println("Sum of entered numbers is: " + sum);
            }

        }

    }
}
