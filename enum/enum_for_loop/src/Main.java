public class Main {
    public enum Margin
    {
        TOP, RIGHT, BOTTOM, LEFT
    }
    public static void main(String[] args) {
        int count = 1;

        for (Margin m: Margin.values())
        {
            System.out.printf("Margin %d = %s\n", count++, m);
        }
    }
}