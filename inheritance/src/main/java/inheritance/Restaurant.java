package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business {

    private String name;
    private String cost;
    private double rating;
    private Review review;

//  ----- constructor ----- //
    Restaurant (String name, String cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

//  ----- getters & setters ----- //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
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
