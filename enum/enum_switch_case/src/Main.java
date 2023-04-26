public class Main {

    enum Margin
    {
        TOP, RIGHT, BOTTOM, LEFT
    }
    public static String getMarginValue(Margin margin)
    {
        switch (margin)
        {
            case TOP:     return "1em";
            case RIGHT:   return "12px";
            case BOTTOM:  return "1.5em";
            case LEFT:    return "6px";
            default:      return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMarginValue(Margin.TOP));
    }
}