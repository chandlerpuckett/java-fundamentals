package inheritance;

public class Review {

    private String body;
    private String author;
    private double starRating;

//    inheritance vs interfaces
//    inheritance ties together abstraction & implementation

//    have the restaurant implement the review
//    each restaurant handles how it implements individual review
//    what is the purpose of the review?
//    what info does the restaurant need?

    Review (String body, String author, double starRating) {
//        Review is a restaurant -- as it stands

        this.body = body;
        this.author = author;
        this.starRating = starRating;

    }

    @Override
    public String toString() {
        return "Review {" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starRating=" + starRating +
                '}';
    }
}
