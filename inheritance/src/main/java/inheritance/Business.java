package inheritance;

public class Business {
    String name;
    String description;
    String cost;
    int rating;

    public Business(){}

    public Business(String name, String description, String cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

//    ----- getters and setters -----
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
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
