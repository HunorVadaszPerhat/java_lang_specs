abstract class Human {
    /*
    * METHODS:
    *   - can be both abstract and non-abstract
    *   - abstract method can have default, protected, public EXCEPT private
    *   - non-abstract can use all modifiers -> default, public, private, protected
    * */

    /*
    * ABSTRACT
    * */
    abstract void defaultDisplayAbstract();
    abstract public void publicDisplayAbstract();
    // Illegal combination of modifiers: 'abstract' and 'private'
    //abstract private void privateDisplayAbstract();
    abstract protected void protectedDisplayAbstract();

    /*
     * NON-ABSTRACT
     * */
    void defaultDisplayNonAbstract(){
        System.out.println("Hello World from defaultDisplayNonAbstract");
    }
    public void publicDisplayNonAbstract(){
        System.out.println("Hello World publicDisplayNonAbstract");
    }
    private void privateDisplayNonAbstract(){
        System.out.println("Hello World from privateDisplayNonAbstract");
    }
    protected void protectedDisplayNonAbstract(){
        System.out.println("Hello World from protectedDisplayNonAbstract");
    }

    /*
     * FIELDS:
     *  - all access modifiers are allowed (default, public, private, protected)
     * - fields can be static and non-static
     * - fields can be final and non-final
     * */
    int a;
    private int b;
    public int c;
    protected int d;

    /*
    * FINAL
    * */
    final int e = 10;
    private final int f = 20;
    public final int g = 30;
    protected final int h = 40;

    /*
    * STATIC
    * */
    static int i = 10;
    private static int j = 20;
    public static int k = 30;
    protected static int l = 40;

    /*
    * STATIC FINAL
    * */
    static final int m = 10;
    private static final int n = 20;
    public static final int o = 30;
    protected static final int p = 40;

    // Constructor ONLY takes fields that are non-static and non-final
    // since final and static fields CANNOT BE CHANGED
    public Human(
            // NON-STATIC AND NON-FINAL
            int a, int b, int c, int d,
            // STATIC
            int i, int j, int k, int l

            // FINAL -> Cannot assign a value to final variable
            // STATIC + FINAL -> Cannot assign a value to final variable
    ) {
        // NON-STATIC AND NON-FINAL
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        // FINAL
        // this.e = e; -> Cannot assign a value to final variable 'e'
        // this.f = f; -> Cannot assign a value to final variable 'f'
        // this.g = g; -> Cannot assign a value to final variable 'g'
        // this.h = h; -> Cannot assign a value to final variable 'h'

        // STATIC
        Human.i = i;
        Human.j = j;
        Human.k = k;
        Human.l = l;

        // STATIC + FINAL
        // this.m = m; -> Cannot assign a value to final variable 'm'
        // this.n = n; -> Cannot assign a value to final variable 'n'
        // this.o = o; -> Cannot assign a value to final variable 'o'
        // this.p = p; -> Cannot assign a value to final variable 'p'
    }
}
