package Activity_52;

public class Book extends Document{
    private String author;
    private String numberPage;

    public Book (String id,String nxb,String number,String author,String numberPage){
        super(id, nxb, number);
        this.author=author;
        this.numberPage=numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(String numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\'' +
                "author='" + author + '\'' +
                ", numerPage='" + numberPage+'\''+
                '}';

    }
}
