# Data Elements and Their Data Types

## Child’s Name
- **Data Type:** `String`
- **Rationale:**  
  Names are purely textual data, potentially including spaces or special characters. A `String` in Java is the most straightforward choice for storing names.

---

## Child’s Age
- **Data Type:** `int`
- **Rationale:**  
  Age is typically represented as a whole number. An `int` can easily handle all typical ages. 

---

## Child’s Date of Birth
- **Data Type:** [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) `LocalDate dateOfBirth;`
- **Rationale:**  
  Storing a date of birth in a proper date/time class allows for easy date manipulation and calculation (e.g., automatically determining age from the date of birth, validating birthdays, etc.). Using `LocalDate` helps avoid many errors associated with older date/time classes. Not required, simply wanted to play with other java packages/libraries.
