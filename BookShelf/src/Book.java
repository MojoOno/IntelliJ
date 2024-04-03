public class Book {
    final private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }



    @Override
    public String toString() {
        return title;
    }
}

