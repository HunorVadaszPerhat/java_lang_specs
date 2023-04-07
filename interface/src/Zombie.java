public class Zombie implements Human {
    @Override
    public void display() {
        System.out.println("Overriden display() from Zombie class.");
    }
    @Override
    public void displayDefault() {
        System.out.println("Overriden displayDefault() from Zombie class.");
    }
}
