public class StaticBlock {
    static int a = 4; //this will remain same for all the objects because static doesn't require object
    static int b;

    static {
        System.out.println("I am static block");
        b = a*5;
    }

    public static void main(String arg[]) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b + "");

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
