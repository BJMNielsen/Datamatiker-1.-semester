package day1;

import java.time.LocalDateTime;

public class HappyKids {
    String name;
    int yearOfBirth;
    int age;

    // Constructor.
    // Hedder altid det samme som klassen.

    HappyKids() {
        // vores tomme default constructor så vi ikke får fejl i de første 5 børn vi har lavet,
        // da vores 2 constructor vil have input fra dem
    }

    HappyKids(String nameInput) {
        name = nameInput;
    }

    public void calculateAge() {
        age = LocalDateTime.now().getYear() - yearOfBirth;
    }
    // Gør at vi bare kan Sout et objekt.
    // På den måde kan man lave alle ens sout ens på tværs af objekter
    // Vi kan formatere det som vi har lyst..


    @Override
    public String toString() {
        return "HappyKids{" +
                "name = " + name +
                ", yearOfBirth = " + yearOfBirth +
                ", age = " + age +
                '}';
    }
}


