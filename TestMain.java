import static java.lang.System.*;

public class TestMain {
    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[4];

        items[0] = new Book("dhgfhdgf", 1925, "fjdsfjhdsj", "978074323483");
        items[1] = new Book("1984", 1949, "476736472332", "9780451524935");
        items[2] = new Magazine("National Geographic", "jdhfjdhfj", "jfhdjfhjd", 1988);
        items[3] = new Magazine("jdfjdhfj", "hdjhfj","hfjdhd" ,1988);

        for (LibraryItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

