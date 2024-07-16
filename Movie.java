import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{

    private int duration;

    public Movie() {
        this(null,null,null,0.0,0);
    }

    public Movie(int duration) {
        this(null, null, null, 0.0,duration);
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user)
    {
        user.setPurchaseMediaList(new Movie(getTitle(),getAuteur(),getISBN(),getPrice(),getDuration()));
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog)
    {
        ArrayList<Movie> arrayList_movie = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (getAuteur().equals(movie.getAuteur())) {
                arrayList_movie.add(movie);
            }
        }
        return arrayList_movie;
    }

    @Override
    public String getMediaType()
    {
        if(duration >= 120)
        {
            return "Long Movie";
        }
        else return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
