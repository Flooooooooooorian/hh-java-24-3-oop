package vererbung;

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        Bike yourBike = new Bike("brand", "model", "color", "type", 3, 5, 120, 60);

        myBike.drive();

        System.out.println(myBike.toString());



    }
}
