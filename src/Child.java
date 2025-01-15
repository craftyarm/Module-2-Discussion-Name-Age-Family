import java.time.LocalDate;

public class Child {
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Child(String name, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters (optional, but often useful)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // For convenient display of the child’s info
    @Override
    public String toString() {
        return "Name: " + name
                + "\nAge: " + age
                + "\nDate of Birth: " + dateOfBirth
                + "\n-------------------------";
    }
}