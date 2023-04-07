public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie();

        // Accessing abstract and default methods
        // From Zombie class that implements Human interface
        zombie.display();
        zombie.displayDefault();

        // Accessing static field and method from Interface
        System.out.println(Human.a);
        Human.displayStatic();
    }
}