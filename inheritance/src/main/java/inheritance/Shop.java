package inheritance;

public class Shop {

    private String name;
    private String description;
    private String cost;

    public Shop(String name, String description, String cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shop {" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
