package inheritance;

public class MovieReview extends Review {
    String movieToReview;

    public MovieReview() {
    }

    public MovieReview(String body, String author, int starRating, String movieToReview) {
        super(body, author, starRating);
        this.movieToReview = movieToReview;
    }

    @Override
    public String toString() {
        return "MovieReview {" +
                "movieToReview='" + movieToReview + '\'' +
                ", body='" + getBody() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", starRating='" + getRating() + '\'' + '}';
    }
}
