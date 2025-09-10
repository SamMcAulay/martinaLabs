public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("john");
        Person p3 = new Person(123, "Mary");
        Person p4 = new Person("James", "Dublin");
        Person p5 = new Person("Claire", 456, "Galway");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
        p5.printDetails();
    }
}
