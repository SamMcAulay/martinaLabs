public class Person {

    private String name;
    private long phoneNumber;
    private String address;

    public Person() {
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

    public void printDetails(){

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("**************************************");
    }
}
