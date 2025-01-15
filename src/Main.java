import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a Family object
        Family myFamily = new Family();

        // Add children to the family
        myFamily.addChild("Justin", 5, LocalDate.of(2018, 5, 12));
        myFamily.addChild("Lester", 8, LocalDate.of(2015, 10, 3));
        myFamily.addChild("Cathy", 3, LocalDate.of(2020, 9, 1));

        // Display the children’s information
        myFamily.displayAllChildren();
    }
}