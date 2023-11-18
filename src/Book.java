import java.util.LinkedList;

class Book {

    private final String isbn;
    private final String title;
    private final String author;
    private final String pubDate;
    private final String publisher;
    private final Genre genre;
    private LinkedList<Review> reviews;
    private float rating = 0;

    public Book(String isbn, String title, String author, String pubDate, String publisher, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.publisher = publisher;
        this.genre = genre;
        reviews = new LinkedList<>();
    }

    /**
     * adds a review to the list of reviews
     * updates the average rating by adjusting it with the new rating
     * @param review
     */
    public void addReview(Review review){
        reviews.add(review);
    }

    /**
     * @ Qamar
     * Calculates an average rating for the book
     * Called after the reviews arraylist is populated
     * Used for popularity heaptrees
     */
    public void calculateRating(){
        float sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        this.rating = sum/(float) reviews.size();
    }

    public void addReview(String review, int rating) {
        addReview(new Review(review, rating));
    }

    public String getISBN() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre.toString();
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }



    public float getReviewRating() {
        return rating;
    }

    public String getPubDate() {
        return pubDate;
    }

    @Override
    public String toString() {
        return ">> " + isbn +  " > " + title +  " > " + author +  " > " + pubDate + " > " + publisher +  " > " + getGenre() + reviews + " > " + getReviewRating() + "<<";
    }
}
