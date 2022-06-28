import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> collectionOfBooks;


    public Library() {
        this.collectionOfBooks = new ArrayList<>();
    }

    public List<Book> getCollectionOfBooks() {
        return collectionOfBooks;
    }

    public void setCollectionOfBooks(List<Book> collectionOfBooks) {
        this.collectionOfBooks = collectionOfBooks;
    }

    @Override
    public String toString() {
        return "Library [collectionOfBooks=" + collectionOfBooks + "]";
    } 

    
}
