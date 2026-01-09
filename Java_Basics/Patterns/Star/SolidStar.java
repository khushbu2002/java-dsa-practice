package Java_Basics.Patterns.Star;

public class SolidStar {

    public static void solidStarPattern(int row, int col) {
        for(int i=1; i<= row; i++) {
            for(int j=1; j<= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        solidStarPattern(5,6);
    }
}
