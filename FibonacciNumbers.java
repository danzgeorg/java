public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The fibonacci (" + n + ") = " + fibonacciSequence(n));
    }
    public static int fibonacciSequence(int n) {
        if (n==0) { return 0;}
        if (n==1) { return 1; }
        return fibonacciSequence(n-1) + fibonacciSequence(n-2);
    }
}

