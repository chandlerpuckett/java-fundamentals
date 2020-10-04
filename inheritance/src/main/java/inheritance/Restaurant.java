package inheritance;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String cost;
    private double rating;
    private Review review;

    ArrayList<Review> reviewList = new ArrayList<>();

//  ----- constructor ----- //
    Restaurant (String name, String cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public void addReview (Review review){
        reviewList.add(review);

        double avgRating;
        int ratingTally = 0;

        for(Review ratings : reviewList){
            ratingTally += ratings.getRating();
        }

        avgRating = (double) ratingTally / reviewList.size();
        this.rating = round(avgRating,1);
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

    private double round (double value, int precision){
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
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
