package inheritance;

public class Shop extends Business {

    public Shop() {
    }

    public Shop(String name, String description, String cost) {
        super(name, description, cost);
    }

    @Override
    public String toString() {
        return "Shop {" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                ", rating=" + rating + '}';
    }
}
