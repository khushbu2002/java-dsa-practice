import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class BasicCalculator {


    public static void main(String arg[]) {
       Scanner sc = new Scanner(System.in);
       int operend1;
        int operend2;

       System.out.println("Please enter 2 numbers to perform action: ");

       operend1 = sc.nextInt();
       operend2 = sc.nextInt();

        System.out.println("Please choose the operation to be performed: ");
        String operator = sc.next();

        switch(operator) {
            case "+":
                System.out.println("your answer is = " + (operend1 + operend2));
                break;
            case "-":
                System.out.println("your answer is = " + (operend1 - operend2));
                break;
            case "/":
                System.out.println("your answer is = " + (operend1 / operend2));
                break;
            case "*":
                System.out.println("your answer is = " + (operend1 * operend2));
                break;
            case "%":
                System.out.println("your answer is = " + (operend1 % operend2));
                break;
            default: System.out.println("nothing choosen ");
        }

    }

}
