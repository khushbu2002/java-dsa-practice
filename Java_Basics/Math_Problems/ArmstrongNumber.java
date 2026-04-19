 public class ArmstrongNumber {

  public static int getNoOfDigits(int n) {
      int counter = 0;
   while(n != 0) {
    n=n/10;
    counter++;
   }
   return counter;
  }

  public static void getArmStrongNum (int num) {
      int original = num;
      int d = getNoOfDigits(num);
      int result = 0;
      while (num !=0) {
          result = result + (int)Math.pow(num % 10, d);
          num = num/10;
      }

      if (result = orignal) {
          System.out.println("Given number is an Armstrong number");
      } else {
          System.out.println("Given number is not an Armstrong number");
      }
  }

  public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      getArmStrongNum(num);
  }

 }