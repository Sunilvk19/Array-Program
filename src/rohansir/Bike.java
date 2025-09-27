package rohansir;

import java.util.Objects;

public class Bike {
    String brand;
    String color;
    int cc;
    double price;

    public Bike(String brand, String color, int cc, double price) {
        this.brand = brand;
        this.color = color;
        this.cc = cc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", cc=" + cc +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return this.brand.equals(bike.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }
}
