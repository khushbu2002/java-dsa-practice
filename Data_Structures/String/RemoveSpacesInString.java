package String;

public class RemoveSpacesInString  {

    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String text = "H e l l o   W o r l d  ";
        String result = removeWhiteSpaces(text);

        System.out.println("Original: " + text);
        System.out.println("Without spaces: " + result);

        //output:
        //Original: H e l l o   W o r l d
        //Without spaces: HelloWorld

    }
}
