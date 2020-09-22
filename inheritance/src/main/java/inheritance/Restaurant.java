package inheritance;

public class Restaurant {

    private String name;
    private String cost;
    private double rating;

//  ----- constructor ----- //
    public Restaurant (String name, String cost, double rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

//  ----- toString ----- //
    @Override
    public String toString() {
        return "Restaurant {" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", rating=" + rating +
                '}';
    }
}
