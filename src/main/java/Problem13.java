//Question 13
//. Take any number as input and print the reverse of the number
//input: 12345
//output: 54321

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int rem = 0;
        int reverse = 0;
        int mul = 10;

        do {
            rem = number % 10;
            reverse = (reverse * mul) + rem;
            number = number/10;
           // mul = 10;

        }
        while (number!=0);
        System.out.println("Reverse number: "+ reverse);

    }
}
