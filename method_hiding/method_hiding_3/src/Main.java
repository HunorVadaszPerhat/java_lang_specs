public class Main {
    public static void main(String[] args) {
        System.out.println("Output:");
        Car car = new Car();
        car.methodA();

        BMW bmw = new BMW();
        bmw.methodA();

        Car carBMW = new BMW();
        carBMW.methodA();
    }
}