public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car(4, "Manual", "saloon");

        c1.printDetails();
        c2.printDetails();
    }
}
