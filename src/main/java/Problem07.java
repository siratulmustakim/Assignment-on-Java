//Quetsion 7
//Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in
// the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        int[] notes = {1000,500,200,100,50,20,10,5,2,1};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount: ");
        int amount = input.nextInt();

        int rem;
        int div = 0;
        for (int i = 0; i<notes.length; i++){
            if(amount>notes[i] || amount==notes[i]){
                rem = amount % notes[i];
                div = amount / notes[i];
                amount = rem;
                System.out.println(notes[i]+ "   "+div);
            }
//            else if (amount==notes[i]) {
//                div = amount / notes[i];
//                System.out.println(notes[i]+ "   "+div);
//            }
        }
       // System.out.println(notes[i]+ "   "+);
    }
}
