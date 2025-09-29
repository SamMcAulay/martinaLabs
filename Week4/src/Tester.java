import java.util.HashMap;

public class Tester {

    public static void main(String[] args) {

        HashMapExample hashMapExample = new HashMapExample();

        Person p = hashMapExample.getRefForName("John");

        p.printDetails();
    }
}
