import java.util.ArrayList;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook()
    {
        this(null,null,null,0.0, null,null);
    }

    public AcademicBook(String subject) {
        this(null,null,null,0.0, null,subject);
    }

    public AcademicBook(int stock, ArrayList<Integer> reviews, String subject) {
        this(null,null,null,0.0, reviews,subject);
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, ArrayList<Integer> reviews, String subject) {
        super(title, auteur, ISBN, price, reviews);
        this.subject = subject;
        super.setStock();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType()
    {
        if(super.getAverageRating() >= 4.5)
        {
            return "Bestselling AcademicBook";
        }
        else return "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
