public class LibraryItem {
    private String title;
    private int yearPublished;

    public LibraryItem(String title, int yearPublished){
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }

    public String getDetails() {
        System.out.println("title:" + title);
        System.out.println("yearPublished:" + yearPublished);
        return 0;
    }
}

