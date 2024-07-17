import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;
    private Media m;
    private Book b;
    public User() {
        this(null,null,null,null);
    }

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(Media media) {
        purchaseMediaList.add(media);
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media)
    {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media)
    {
        shoppingCart.remove(media);
    }

    public void checkout()
    {
        purchaseMediaList.add(new Media(m.getTitle(),m.getAuteur(),m.getISBN(),m.getPrice()));
        b.restock(-1);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCart=" + shoppingCart +
                ", m=" + m +
                ", b=" + b +
                '}';
    }
}
