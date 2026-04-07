public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum=0;
      while(num!=0) {
          sum = sum + num%10;
          num=num/10;
      }
      return sum;
    }

    public static void main(String arg[]) {
        System.out.println(sumOfDigits(931205));
    }
}
