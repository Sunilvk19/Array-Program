package rohansir;

public class Mobile implements Comparable<Mobile>{
   String brand;
   Double price;
   String color;

    public Mobile(String brand, Double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile[" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ']';
    }

    @Override
    public int compareTo(Mobile mob) {
        return this.brand.compareTo(mob.brand);
    }
}
