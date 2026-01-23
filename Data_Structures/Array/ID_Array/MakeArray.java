import java.util.Scanner;

public class MakeArray {
    public static void main(String arg[]) {
        int size = 5;
        int[] arr = new int[size];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            System.out.print(arr[i]);
        }
    }
}
