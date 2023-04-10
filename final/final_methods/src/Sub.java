public class Sub extends Super {
    // final methods CANNOT BE OVERRIDEN by sub-classes
    void method1(){};

    void method2(){
        System.out.println("Sub class : non-final method2");
    }
}
