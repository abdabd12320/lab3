import java.util.*;
public class Main{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


                Media media1 = new Media();

        Book book1 = new Book();

        Music music1 = new Music();

        Movie movie1 = new Movie();

        Review review1 = new Review();

        User user1 = new User();

        Store store1 = new Store();

        AcademicBook academicBook1 = new AcademicBook();

        Novel novel1 = new Novel();

        Media media2 = new Media("Do not cry","Saleem maged","123asd",75);
        ArrayList<Integer> r = new ArrayList<>();
        Book book2 = new Book("The death","Fady","1235asdq",100,r);

        Music music2 = new Music("The sea","snop dog","1236asas",120,1);

        Movie movie2 = new Movie("The planet","Dode","1232qwa",50,150);

        Review review2 = new Review("abdadb1",4,"Good");
        ArrayList<Media> array_m1 = new ArrayList<>();
        ArrayList<Media> array_m2 = new ArrayList<>();
        User user2 = new User("Sami0","sami123_s@gmail.com",array_m1,array_m2);
        ArrayList<User> u = new ArrayList<>();
        ArrayList<Media> m = new ArrayList<>();
        Store store2 = new Store(u,m);

        AcademicBook academicBook2 =
                new AcademicBook("How can we overcome on the sad","Gamal","1299o",200,r,"Master Thesis");

        Novel novel2 = new Novel("1984","gorge oriel","1212qqa",30,r,"Corrupt city");

        Media media3 = new Media();
        media3.setTitle("fish");
        media3.setAuteur("Ali");
        media3.setISBN("122ws");
        media3.setPrice(45);

        Book book3 = new Book();
        book3.setTitle("The apple");
        book3.setAuteur("Ahmed");
        book3.setISBN("12wsx5");
        book3.setPrice(46);
        book3.setStock();

        Music music3 = new Music();
        music3.setTitle("sem sem");
        music3.setAuteur("Hanan");
        music3.setISBN("12aaa1");
        music3.setPrice(400);
        music3.setArtist(3);

        Movie movie3 = new Movie();
        movie3.setTitle("The garden");
        movie3.setAuteur("Jon");
        movie3.setISBN("gg4728");
        movie3.setPrice(230);
        movie3.setDuration(4);

        Review review3 = new Review();
        review3.setUsername("Dalaly11");
        review3.setRating(2);
        review3.setComment("Very bad");

        User user3 = new User();
        user3.setUsername("Yara");
        user3.setEmail("yarayara01@gmail.com");
//        user3.setPurchaseMediaList(media2);
//        user3.setShoppingCart(media2);

        Store store3 = new Store();
//        store3.setUsers(user2);
//        store3.searchBook("The garden");
//        store3.setMedias(media3);
//        store3.addUser(user1);

        AcademicBook academicBook3 = new AcademicBook();
        academicBook3.setTitle("The garden");
        academicBook3.setAuteur("Jon");
        academicBook3.setISBN("gg4728");
        academicBook3.setPrice(230);
//        academicBook3.setReviews(1);
        academicBook3.setSubject("Peo");
        academicBook3.setStock();

        Novel novel3 = new Novel();
        novel3.setTitle("The tree");
        novel3.setAuteur("Kamil");
        novel3.setISBN("234gsy");
        novel3.setPrice(310);
//        novel3.setReviews(2);
        novel3.setGenre("nothing");
        novel3.setStock();

        System.out.println(media1.toString());
        System.out.println(media2.toString());
        System.out.println(media3.toString());
        System.out.println(media2.getTitle());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book3.getStock());

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
        System.out.println(movie3.toString());
        System.out.println(movie2.getDuration());
        System.out.println(academicBook1.toString());
        System.out.println(academicBook2.toString());
        System.out.println(academicBook3.toString());
        System.out.println(academicBook1.getISBN());
        System.out.println(novel1.toString());
        System.out.println(novel2.toString());
        System.out.println(novel3.toString());
        System.out.println(novel2.getISBN());
        System.out.println(music1.getPrice());
        System.out.println(music1.toString());
        System.out.println(music2.toString());
        System.out.println(music2.toString());
        System.out.println(music2.getPrice());
        System.out.println(review1.toString());
        System.out.println(review2.toString());
        System.out.println(review3.toString());
        System.out.println(review3.getComment());
        System.out.println(store1.toString());
        System.out.println(store2.toString());
        System.out.println(store3.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user2.getEmail());
    }
}
