//Question 14
//Find out the duplicate numbers in the given array and in which position they are found.
//numbers=[1,2,3,1,2,4,5,6,4]
//Output:
//Duplicate value: 1 at index 3
//Duplicate value: 2 at index 4
//Duplicate value: 4 at index 8

public class Problem14 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,4,5,6,4};

        for (int i = 0; i<array.length; i++){
            int[] position = new int[array.length];   // ekhane declare korlam, jeno position-array refreshed thake.
            int k = 0;
            for (int j = i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    position[k] = j;
                    k++;
                }
            }
            if(k!=0) {
                System.out.print(array[i] + " at index ");
                for (int a : position) {
                    if (a == 0) {
                        System.out.println();
                        break;
                    }
                    System.out.print(a + " ");

                }
            }

        }
    }
}
