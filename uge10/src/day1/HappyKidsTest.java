package day1;

public class HappyKidsTest {

    public static void main(String[] args) {
        new HappyKidsTest().kids();
    }

    public void kids() {
        HappyKids kid1 = new HappyKids();
        HappyKids kid2 = new HappyKids();
        HappyKids kid3 = new HappyKids();
        HappyKids kid4 = new HappyKids();
        HappyKids kid5 = new HappyKids();
        HappyKids kid6 = new HappyKids("Tilde");
        HappyKids kid7 = new HappyKids("Mars");

        kid1.name = "Lars";
        kid1.yearOfBirth = 1993;
        kid1.calculateAge();

        kid2.name = "Bob";
        kid2.yearOfBirth = 1994;
        kid2.calculateAge();

        kid3.name = "Svend";
        kid3.yearOfBirth = 1995;
        kid3.calculateAge();

        kid4.name = "Mathias";
        kid4.yearOfBirth = 1996;
        kid4.calculateAge();

        kid5.name = "Børge";
        kid5.yearOfBirth = 1997;
        kid5.calculateAge();

        //System.out.println(kid1.name + "\n" + kid2.name + "\n" + kid3.name + "\n" + kid4.name + "\n" + kid5.name);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(kid4);
        System.out.println(kid5);
        System.out.println(kid6);
        System.out.println(kid7);
    }
}
