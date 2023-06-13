//Question 11
//Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]

public class Problem11 {
    public static void main(String[] args) {
        int[] array = {5,3,9,7,4,1,8};
        int x;

        // We can do it by finding the max, then 2nd max. Or we can simply sort the array.
        // I am sorting
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
//        for (int a:array) {
//            System.out.print(a+"  ");  // sorted array
//        }
        System.out.println("\nSecond largest element: "+array[array.length-2]);
    }
}
