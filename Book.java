public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int yearPublished, String author, String isbn){
        super(title, yearPublished);
        this.isbn = isbn;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public String getDetails(){
        super.getDetails();
            System.out.println("author:"+author);
            System.out.println("isbn:"+isbn);
        return null;
    }
}
