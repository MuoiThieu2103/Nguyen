public class Magazine extends LibraryItem{
    private String issueNumber;
    private String publisher;

    public Magazine(String issueNumber, String publisher, String title, int yearPublished){
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber='" + issueNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getDetails(){
        super.getDetails();
        System.out.println("issueNumber"+issueNumber);
        System.out.println("publisher"+publisher);
        return null;
    }
}
