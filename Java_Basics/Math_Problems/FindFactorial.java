public class FindFactorial {
    //here i am making a function to print out the factorial of a number n
    // n! = n* (n-1)!

    public static int numFactorial(int n) {
        if(n == 0 || n==1) {
            return 1;
        }
        return n * numFactorial(n - 1);
    }

    public static void main(String arg[]) {
        System.out.println( "5 Factorial = " + numFactorial(5));
    }
}
