//Question 6
// Generate random 10 integer numbers in an array and print out all the numbers from array and also print the
// max and min number from the array

public class Problem06 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // Random numbers in array, and printing these
        for (int i =0; i<10; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("Random numbers: ");
        for (int a: arr) {
            System.out.print(" "+a);
        }
        // Max, min from array
        int max = arr[0], min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("\nMax = "+max+" , Min = "+min);

    }
}
