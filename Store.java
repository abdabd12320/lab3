import java.util.ArrayList;

public class Store {

    private ArrayList<User> users;
    private ArrayList<Media> medias;

    public Store()
    {
        this(null,null);
    }

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(User user) {
        this.users.add(user);
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(Media media) {
        this.medias.add(media);
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public ArrayList<User> displayUsers()
    {
        return users;
    }

    public void addMedia(Media media)
    {
        medias.add(media);
    }

    public ArrayList<Media> displayMedia()
    {
        return medias;
    }

    public Book searchBook(String title)
    {
        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i).getTitle().equalsIgnoreCase(title)) {
                return (Book) medias.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
