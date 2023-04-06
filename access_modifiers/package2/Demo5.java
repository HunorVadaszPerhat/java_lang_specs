public class Demo5 {
    /* DIFFERENT PACKAGE - NON-SUBCLASS
     * Demo1 is non-sublcass in different package
     **/
    Demo1 demo1 = new Demo1();
    demo1.display();

    // default member cannot be accessed outside of package as non-subclass
    System.out.println(demo1.a);
    // public member can be accessed outside of package as non-subclass
    System.out.println(demo1.b);
    // protected member cannot be accessed outside of package as non-subclass
    System.out.println(demo1.c);
    // private member cannot be accessed outside of package as non-subclass
    System.out.println(demo1.d);

    System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);
}
