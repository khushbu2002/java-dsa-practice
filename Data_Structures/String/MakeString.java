package String;

public class MakeString {
    public static void main(String[] arg) {

        String s1 = "Hello";
        System.out.println("String: " + s1);

        StringBuilder sb = new StringBuilder("Hello World"); //using string builder
        System.out.println(sb);
        sb.delete(5, 11);
        System.out.println(sb);
        System.out.println(sb);


    }

}
