//Question 1
// Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class Problem01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Initial value of a = "+a+", b = "+b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, a = "+a+", b = "+b);

    }
}
