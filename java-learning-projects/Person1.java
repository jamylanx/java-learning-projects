// Define a class named Person
class Person {
    // Class variables
    String name;
    int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person1{
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        // Calling method to display information about the persons
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
