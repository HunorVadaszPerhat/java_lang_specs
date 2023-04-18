public class MyClass {
    private int x;
    private int y;
    
    public MyClass() {
        // Calls the two-parameter constructor with default values
        this(0, 0);
    }

    public MyClass(int x) {
        // Calls the two-parameter constructor with default y value
        this(x, 0);
    }

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
