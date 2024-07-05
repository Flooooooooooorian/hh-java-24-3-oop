package vererbung;

import java.util.Objects;

public class Bike {

    private int numberOfWheels;
    private int price;
    private int sattleHöhe;
    private int rahmenGröße;

    private Vehicle vehicle;

    public Bike() {

    }

    public Bike(String brand, String model, String color, String type, int numberOfWheels, int price, int sattleHöhe, int rahmenGröße) {

        this.numberOfWheels = numberOfWheels;
        this.price = price;
        this.sattleHöhe = sattleHöhe;
        this.rahmenGröße = rahmenGröße;

        this.vehicle = new Vehicle(brand, model, color, type);
    }

    public void drive() {
        System.out.println("trampeln");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSattleHöhe() {
        return sattleHöhe;
    }

    public void setSattleHöhe(int sattleHöhe) {
        this.sattleHöhe = sattleHöhe;
    }

    public int getRahmenGröße() {
        return rahmenGröße;
    }

    public void setRahmenGröße(int rahmenGröße) {
        this.rahmenGröße = rahmenGröße;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return numberOfWheels == bike.numberOfWheels && price == bike.price && sattleHöhe == bike.sattleHöhe && rahmenGröße == bike.rahmenGröße && Objects.equals(vehicle, bike.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels, price, sattleHöhe, rahmenGröße, vehicle);
    }

    @Override
    public String toString() {
        return "Bike{" +
               "numberOfWheels=" + numberOfWheels +
               ", price=" + price +
               ", sattleHöhe=" + sattleHöhe +
               ", rahmenGröße=" + rahmenGröße +
               ", vehicle=" + vehicle +
               '}';
    }
}
