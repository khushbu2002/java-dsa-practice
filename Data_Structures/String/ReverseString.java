package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed1 += str.charAt(i);
        }
        System.out.println("Loops method: " + reversed1);
       //string builder class used here.
        String reversed2 = new StringBuilder(str).reverse().toString();
        System.out.println("StringBuilder Method:" + reversed2);
    }
}
