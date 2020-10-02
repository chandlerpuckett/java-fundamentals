package inheritance;

public class Review {

    private String body;
    private String author;
    private int rating;

    Review (String body,
            String author,
            int starRating) {

        this.body = body;
        this.author = author;
        this.rating = starRating;
    }

//    ----- getters & setters -----
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

//    ----- to string -----
    @Override
    public String toString() {
        return "Review {body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starRating=" + rating +
                '}';
    }
}
