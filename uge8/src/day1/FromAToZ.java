package day1;

public class FromAToZ {

    public void loopAToZ() {
        char alfabet;

        for (alfabet = 'a'; alfabet <= 'z'; alfabet++) {
            System.out.println(alfabet);
        }
    }

    public void loopZToA() {
        char alfabet;
        for (alfabet = 'z'; alfabet >= 'a'; alfabet--) {
            System.out.println(alfabet);
        }
    }

    public static void main(String[] args) {
        FromAToZ AToZ = new FromAToZ();
        AToZ.loopAToZ();
        AToZ.loopZToA();
    }
}
