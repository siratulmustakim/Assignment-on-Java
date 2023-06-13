//Question 2
//Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10

public class Problem02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Initial value of a = "+a+", b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping, a = "+a+", b = "+b);
    }

}
