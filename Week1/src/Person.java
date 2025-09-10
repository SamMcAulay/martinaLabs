public class Person {

    private String name;
    private long phoneNumber;
    private String address;

    public Person() {
        this.name = null;
        this.phoneNumber = 0;
        this.address = null;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public Person(long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public Person(String name, long phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    Person p1 = new Person();
    Person p2 = new Person("John");
    Person p3 = new Person("Mary", "Cork");
    Person p4 = new Person(123,"Claire");
    Person p5 = new Person("Michael", 456, "Dublin");
}
