public class Person {

    private final String name;
    private final String address;
    private final long number;
    public Person(String name, String address, long number) {
        super();
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void printDetails() {
        System.out.println("Name: " +name);
        System.out.println("Address: " +address);
        System.out.println("Number: " +number);

    }
}