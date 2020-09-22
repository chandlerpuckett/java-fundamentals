package inheritance;

public class Review {

    private String body;
    private String author;
    private double starRating;

    public Review(String body, String author, double starRating) {
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
