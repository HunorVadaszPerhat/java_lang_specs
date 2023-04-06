public class Demo3 extends Demo1{
    /*
     * SAME PACKAGE - SUBCLASS
     * Demo1 is a subclass in same package
     **/

    // default member can be accessed inside of same package as sub-class
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
