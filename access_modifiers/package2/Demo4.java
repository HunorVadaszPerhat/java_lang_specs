public class Demo4 extends Demo1 {
    /*
     * DIFFERENT PACKAGE - SUBCLASS
     * Demo1 is subclass in same package
     **/

    // default member cannot be accessed inside of same package as sub-class
    System.out.println(a);
    // public member can be accessed inside of same package as sub-class
    System.out.println(b);
    // protected member can be accessed inside of same package as sub-class
    System.out.println(c);
    // private member cannot be accessed inside of same package as sub-class
    System.out.println(d);

    public void display() {
        System.out.println(a + b + c + d);
    }
}
