package day1;

public class StabiloBossObjects {
    public static void main(String[] args) {
        new StabiloBossObjects().markers();
    }

    public void markers() {
        StabiloBoss marker = new StabiloBoss();
        StabiloBoss marker2 = new StabiloBoss();

        marker.color = "dove blue";
        marker.thickness = 34;
        marker.inkLeft = 55;
        System.out.println(marker.color);
        System.out.println(marker.thickness);
        System.out.println(marker.inkLeft);

        
        marker2.color = "yellow";
        marker2.thickness = 14;
        marker2.inkLeft = 66;
        System.out.println(marker2.color);
        System.out.println(marker2.thickness);
        System.out.println(marker2.inkLeft);
    }
}
