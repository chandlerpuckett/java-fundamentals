package inheritance;

import java.util.ArrayList;

public class Shop extends Restaurant {

    private String name;
    private String description;
    private String cost;

    public ArrayList<Review> feedback = new ArrayList<>();

    public Shop(String name, String description, int rating, String cost) {

        super(name, description, rating);
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

//  ----- getters & setters -----


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

}
