package inheritance;

public class Review {

    private String body;
    private String author;
    private double starRating;

    public Restaurant restaurant;
    public Shop shop;


//    inheritance vs interfaces
//    inheritance ties together abstraction & implementation

//    have the restaurant implement the review
//    each restaurant handles how it implements individual review
//    what is the purpose of the review?
//    what info does the restaurant need?

    Review (String body,
            String author,
            double starRating,
            Restaurant restaurant) {
//        Review is a restaurant -- as it stands

        this.body = body;
        this.author = author;
        this.starRating = starRating;
        this.restaurant = restaurant;

    }


//    specificRestaurant.getName(); .getStars() etc.
    @Override
    public String toString() {

        String typeOf = "";

        if (restaurant.getName() == null){
            typeOf = "shop='" + shop.getName() + '\'';
        } else {
            typeOf = "restaurant='" + restaurant.getName() + '\'';
        }

        return "Review {" +
                typeOf +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starRating=" + starRating +
                '}';
    }
}
