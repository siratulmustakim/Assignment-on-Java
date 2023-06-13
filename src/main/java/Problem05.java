// Question 5
//Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5

public class Problem05 {
    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        for (int i = 0; i<array.length; i++){
            if(array[i]==key){
                System.out.println("Key if found at index "+i);
                break;
            }
        }
    }
}






















