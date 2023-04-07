public interface Human {
    int a = 10; // SAME AS public static final int a = 10;
    void display();
    default void displayDefault(){
        System.out.println("displayDefault() from Human interface");
    };
    static void displayStatic(){
        System.out.println("displayStatic() from Human interface");
    };
}
    /*
     * FIELDS:
     * - all fields are by default PUBLIC STATIC FINAL
     * - specifying a field PUBLIC STATIC FINAL is not necessary -> it is redundant code
     * */

    // public static final int a = 10; // ->  specifying a field PUBLIC STATIC FINAL is not necessary

    /*
     * CONSTRUCTORS ARE NOT ALLOWED
     * */

    /*
     * METHODS:
     * - can be ONLY abstract
     * - methods are by default PUBLIC ABSTRACT
     * - from Java 8 there can be DEFAULT and STATIC methods -> BUT with method body
     * */



