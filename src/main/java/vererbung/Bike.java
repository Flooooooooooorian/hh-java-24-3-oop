package vererbung;

import java.util.Objects;

public class Bike extends Vehicle {

    private int numberOfWheels;
    private int price;
    private int sattleHöhe;
    private int rahmenGröße;

    public Bike() {
        super();
    }

    public Bike(String brand, String model, String color, String type, int numberOfWheels, int price, int sattleHöhe, int rahmenGröße) {
        super(brand, model, color, type);

        this.numberOfWheels = numberOfWheels;
        this.price = price;
        this.sattleHöhe = sattleHöhe;
        this.rahmenGröße = rahmenGröße;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return numberOfWheels == bike.numberOfWheels && price == bike.price && sattleHöhe == bike.sattleHöhe && rahmenGröße == bike.rahmenGröße;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels, price, sattleHöhe, rahmenGröße);
    }

    @Override
    public String toString() {
        return "Bike{" +
               "numberOfWheels=" + numberOfWheels +
               ", price=" + price +
               ", sattleHöhe=" + sattleHöhe +
               ", rahmenGröße=" + rahmenGröße +
               ", brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", type='" + type + '\'' +
               '}';
    }
}
