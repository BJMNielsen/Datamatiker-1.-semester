package day3;

public class Student {
    private String name;
    private double avgGrade;
    private String phone;
    private int yearOfBirth; // Vi vil ikke have andre skal ændre fødselsår, så vi laver kun en getYearOfBirth

    Student() { //tom konstruktør
    }

    Student(int year) {
        this.yearOfBirth = year;
    }

    //før hvor vi direkte fik adgang til attributerne, er vi nødt til at lave en metode nu, da de er private.
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phoneNr) {
        this.phone = phoneNr;
    }

    public String getPhone() {
        return phone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}




