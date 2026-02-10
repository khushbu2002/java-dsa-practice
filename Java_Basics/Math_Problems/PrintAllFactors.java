import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i=1;
        while (i<=num) {
            if(num%i==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
