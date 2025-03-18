// Person class to demonstrate constructors
class Person {
    // Attributes
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class containing the main method
public class PersonDemo {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();

        // Displaying the details
        person1.displayPerson();
        person2.displayPerson();
    }
}
