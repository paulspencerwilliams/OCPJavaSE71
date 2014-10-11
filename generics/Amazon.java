import java.util.List;
import java.util.ArrayList;

public class Amazon {
  public static void main (String[] args) {
    List<Book> books = new ArrayList<Book>();
    books.add(new Book(343)); 
    List<? extends Gift> wishlist = books;
    // wishlist.add(anything) // won't work

    for (Gift g : wishlist )
    {
      System.out.println(g.getPrice());
    }
  }
}
