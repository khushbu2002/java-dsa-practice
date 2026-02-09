import java.util.Scanner;

public class ReverseNum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int reverse =0;
        int n = sc.nextInt();
        while (n>0) {
            int lastdigit = n%10;
            reverse = reverse*10 + lastdigit;
            n =n/10;
        }
        System.out.println(reverse);
    }
}
