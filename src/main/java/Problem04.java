//Question 4
// Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
//key=5

public class Problem04 {
    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        int x, mid;
        int low = 0;
        int high = array.length - 1;
        boolean flag = true;



        // array sorting
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
//            System.out.print(" "+a);  // sorted array
//        }

        // Binary search
        while (flag) {
//            System.out.println("chk  ");
            mid = low + ((high - low)/2);
            if((high - low)<2){                      // this is to avoid error when array has only two elements.
                mid = low + (high - low);
            }
            if (key>array[mid]){
               // System.out.println("chk high ");
                low = mid;
            }
            else if (key<array[mid]) {
              //  System.out.println("chk low ");
                high = mid;
            }
            else {
                //System.out.println("Key is found at index "+mid);
                System.out.println("Key "+key+" is found in array");
                flag = false;
            }
        }
    }

    }

// key = 15 hoel error