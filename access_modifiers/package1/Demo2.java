public class Demo2 {
    /*
     * SAME PACKAGE - NON-SUBCLASS
     * Demo1 is non-subclass in same package
     **/
    Demo1 demo1 = new Demo1();

    // default member can be accessed inside of same package as non-subclass
    demo1.a;
    // public member can be accessed inside of same package as non-subclass
    demo1.b;
    // protected member can be accessed inside of same package as non-subclass
    demo1.c;
    // private member cannot be accessed inside of same package as non-subclass
    demo1.d;
    public void display() {
        System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);
    };
}
