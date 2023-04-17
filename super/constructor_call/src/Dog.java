public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the Animal constructor with two parameters
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
