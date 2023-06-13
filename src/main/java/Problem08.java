//Question 8
// Print the prime numbers of 2 to 100

public class Problem08 {
    public static void main(String[] args) {
        int rem;
        int count = 0;
        boolean flag;

        for (int i = 2; i<=100; i++){
            flag = true;
            for(int j = 2; j<i; j++){
                rem = i%j;
                if(rem==0){
                  //  System.out.println("Not prime");
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print(i+"  ");
            }
        }
        System.out.println("\nTotal prime numbers between 2-100 is: "+count);
    }
}
