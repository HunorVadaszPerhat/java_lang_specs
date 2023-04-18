public class Dog extends Animal {
    public void eat() {
        // Call the eat() method in the Animal superclass
        super.eat();
        System.out.println("The dog is eating.");
    }

    // Set the age variable in the Animal superclass
    public void setAge(int age) {
        super.age = age;
    }
}
