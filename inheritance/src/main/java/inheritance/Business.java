package inheritance;

import java.util.ArrayList;

public class Business {
    String name;
    String description;
    String cost;
    double rating;
    Review review;

    ArrayList<Review> reviewList = new ArrayList<>();

//    ----- constructors -----
    public Business(){}

    public Business(String name, String description, String cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }


//    ----- functions -----
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


//    ----- helper functions -----
    private double round (double value, int precision){
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
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
