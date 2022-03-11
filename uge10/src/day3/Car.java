package day3;

public class Car {
    private String brand;
    private String make;
    private String honk;
    private boolean engineStatus = false;
    private Driver myDriver;

    Car(String brand1, String make1, String honk1) {
        setBrand(brand1);
        setMake(make1);
        setHonk(honk1);
        engineStatus = false;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setMake(String m) {
        this.make = m;
    }

    public String getMake() {
        return make;
    }

    public void setHonk(String h) {
        this.honk = h;
    }

    public String getHonk() {
        return honk;
    }

    public void sound() {
        System.out.println(getHonk());
    }

    public void setDriver(Driver myDriver) {
        this.myDriver = myDriver;
        System.out.println("Your myDriver " + myDriver.getname() + " has entered the vehicle");
    }

    public Driver getmyDriver() {
        return myDriver;
    }
    ////////////////////////////////////////////////////////

    public void drive() {
        if (myDriver != null) {
            if (engineStatus == true) {
                System.out.println(getBrand() + " " + getMake() + " kører.");
            } else
                System.out.println("Your car isn't turned on. You cannot drive anywhere.");
        } else
            System.out.println("Your car has no myDriver, you cant drive anywhere!");
    }

    public void park() {
        if (myDriver != null)
            System.out.println(getBrand() + " " + getMake() + " parkeret.");
        else
            System.out.println("You can't park without a myDriver");
    }

    public void turnEngineOn() {
        if (myDriver != null)
            engineStatus = true;
        else {
            engineStatus = false;
            System.out.println("You cannot start the car without a myDriver");
        }
    }

    public void turnEngineOff() {
        engineStatus = false;
    }
}


