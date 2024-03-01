/*
 * Create a class called Name that represents a person's name. The class should have fields named 
 * firstName representing the person's first name, lastName representing their last name, and 
 * middleInitial representing their middle initial (a single character). Your class should contain 
 * only fields for now.
 * 
 * In order for Practice-It to properly test your class, make sure to use exactly the class name and 
 * field names described previously. Also make sure to declare your fields using appropriate types.
 */
package Lab15__3_4;

// LAB 12 PART ONE [Name]
public class Name {
    String firstName;
    String lastName;
    char middleInitial;

    // LAB 15 PART ONE [constructorName]
    // Constructor
    public Name(String firstName, char middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    // LAB 15 PART TWO [toStringName]
    // Returns a formatted string result
    @Override
    public String toString() {
        return firstName + " " + middleInitial + ". " + lastName;
    }

    public static void main(String[] args) {
        Name john = new Name("John", 'Q', "Public");
        System.out.println(john.toString());
    }
}
