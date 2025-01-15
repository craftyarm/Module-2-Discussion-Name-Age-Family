import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Family {
    // List to store Child objects
    private List<Child> children;

    public Family() {
        this.children = new ArrayList<>();
    }

    // Method to add a child by providing name, age, and date of birth
    public void addChild(String name, int age, LocalDate dateOfBirth) {
        Child newChild = new Child(name, age, dateOfBirth);
        children.add(newChild);
    }

    // Method to display all children’s information
    public void displayAllChildren() {
        for (Child child : children) {
            System.out.println(child.toString());
        }
    }
}