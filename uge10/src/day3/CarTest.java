package day3;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("VW", "Golf", "MEEEEEEEEEEEEEEEEEEEEEEEEEEP");
        Driver myDriver = new Driver("Lars");
        myCar.setDriver(myDriver);
        
        // System.out.println(myCar.getDriver().getname());
        myCar.sound();
        myCar.turnEngineOn();
        myCar.drive();
        myCar.park();

    }
}
