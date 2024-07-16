import java.util.ArrayList;

public class Novel extends Book{

    private String genre;

    public Novel() {
        this(null,null,null,0.0, null,null);
    }

    public Novel(String genre) {
        this(null,null,null,0.0, null,genre);
    }

    public Novel(ArrayList<Integer> reviews, String genre) {
        this(null,null,null,0.0, reviews,genre);
    }

    public Novel(String title, String auteur, String ISBN, double price, ArrayList<Integer> reviews, String genre) {
        super(title, auteur, ISBN, price, reviews);
        this.genre = genre;
        super.setStock();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType()
    {
        if(super.getAverageRating() >= 4.5)
        {
            return "Bestselling Novel";
        }
        else return "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
