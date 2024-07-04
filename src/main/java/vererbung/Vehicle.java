package vererbung;

import java.util.Objects;

public class Vehicle extends Object {
    protected String brand;
    protected String model;
    protected String color;
    protected String type;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public void drive() {
        System.out.println("drive");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(color, vehicle.color) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, type);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", type='" + type + '\'' +
               '}';
    }
}
