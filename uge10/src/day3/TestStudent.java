package day3;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.name = "patrick" det her kan vi ikke mere
        s1.setName("Patrick");
        System.out.println(s1.getName());

        s1.setPhone("31316163");
        System.out.println(s1.getPhone());

        Student s2 = new Student(2016);
        System.out.println("Year: " + s2.getYearOfBirth());
    }
}
