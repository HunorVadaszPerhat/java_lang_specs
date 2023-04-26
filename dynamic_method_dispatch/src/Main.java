public class Main {
    public static void main(String[] args) {
        Super s = new Super();
        // method1 from Super class
        s.method1();
        // method2 from Super class
        s.method2();

        Super sub = new Sub();
        // method1 from Super class
        sub.method1();
        // method2 from Sub
        sub.method2();
        // Cannot resolve method 'method3' in 'Super'
        //sub.method3();

        //Sub sub1 = new Super();
    }
}