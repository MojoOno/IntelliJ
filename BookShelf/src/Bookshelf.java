import java.util.ArrayList;

public class Bookshelf {
    private final ArrayList<Book> bookTitleList = new ArrayList<>();
    private String shelfName;

    public Bookshelf(String shelfName) {
        this.shelfName = shelfName;
    }

    public void addBook(Book title){
        bookTitleList.add(title);
    }
    public void removeBook(Book title){
        if(bookTitleList.contains(title)){
        bookTitleList.remove(title);
        }else{
            System.out.println("I dont have that book on my shelve");
        }
    }
    public void displayBooks(){
        StringBuilder output = new StringBuilder(shelfName + "\n");
        for(Book b : bookTitleList){
            output.append("* ").append(b).append(",\n");
        }
        System.out.println(output);
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "bookTitleList=" + bookTitleList +
                '}';
    }
}
