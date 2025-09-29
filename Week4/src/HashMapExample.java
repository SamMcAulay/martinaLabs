import java.util.HashMap;

public class HashMapExample {

    private HashMap<String, Person> theListOfPeople = new HashMap();

    public HashMapExample() {

        theListOfPeople.put("michael", new Person("John", "dublin", 2345345));
        theListOfPeople.put("Mary", new Person("Mary", "cork", 23425 ));
        theListOfPeople.put("Claire", new Person("Claire", "Westmeath", 123513));
        theListOfPeople.put("John", new Person("John", "Galway", 1235123));

    }

    public Person getRefForName(String name) {
        return theListOfPeople.get(name);
    }

}
