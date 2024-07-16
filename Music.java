import java.util.ArrayList;
import java.util.List;
public class Music extends Media{

    private int artist;

    public Music()
    {
        this(null, null, null, 0.0,0);
    }

    public Music(int artist) {
        this(null, null, null, 0.0,artist);
    }

    public Music(String title, String auteur, String ISBN, double price, int artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public int getArtist() {
        return artist;
    }

    public void setArtist(int artist) {
        this.artist = artist;
    }

    public void listen(User user)
    {
        user.setPurchaseMediaList(new Music(getTitle(),getAuteur(),getISBN(),getPrice(),getArtist()));
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog)
    {
        ArrayList<Music> arrayList_music = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (getAuteur().equals(music.getAuteur())) {
                arrayList_music.add(music);
            }
        }
        return arrayList_music;
    }

    @Override
    public String getMediaType()
    {
        if(getPrice() >= 10)
        {
            return "Premium Music";
        }
        else return "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist=" + artist +
                "} " + super.toString();
    }
}
