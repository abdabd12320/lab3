import java.util.ArrayList;
public class Book extends Media{

    private static int stock;
    private ArrayList<Integer> reviews;

    public Book()
    {
        this(null, null, null, 0.0,null);
    }

    public Book(ArrayList<Integer> reviews)
    {
        this(null,null,null,0.0,reviews);
    }

    public Book(String title, String auteur, String ISBN, double price, ArrayList<Integer> reviews) {
        super(title, auteur, ISBN, price);
        stock++;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock() {
        stock++;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(Integer review) {
        reviews.add(review);
    }

    //important
    public void addReview(Review review)
    {
        reviews.add((int)review.getRating());
    }

    public double getAverageRating()
    {
        double avg = 0;
        int i = 0;
        for (Integer e: reviews)
        {
            avg += e;
            i++;
        }

        return avg/i;
    }

    public void purchase(User user)
    {

        user.setPurchaseMediaList(new Media(getTitle(),getAuteur(),getISBN(),getPrice()));
        stock--;
    }

    public boolean isBestseller()
    {
        if(getAverageRating() >= 4.5)
        {
            return true;
        }
        else return false;
    }

    public void restock(int quantity)
    {
        stock += quantity;
        System.out.println("Done restock");
    }

    @Override
    public String getMediaType()
    {
        if(getAverageRating() >= 4.5)
        {
            return "Bestselling Book";
        }
        else return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                "} " + super.toString();
    }
}
