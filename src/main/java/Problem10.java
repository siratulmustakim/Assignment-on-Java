//Question 10
//Write a program that will give following output:
//12345
//2345
//345
//45
//5

public class Problem10 {
    public static void main(String[] args) {
        int k;
        int r = 6;
        for(int i = 1; i<r; i++) {
            k = i;
            for (int j = 1; j <=r-i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
