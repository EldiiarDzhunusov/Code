package Quiz;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String ans = "";
        if(authors.length>0){
            ans+=authors[0].toString();
            for (int i = 1; i < authors.length; i++) {
                ans+=",";
                ans+=authors[i].toString();
            }
        }

        return "Quiz.HW.Book[" +
                "name=" + name +
                ",authors={" +
                ans +
                "},price=" + price +
                ",qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        String ans= "";
        if(authors.length>0){
            ans+=authors[0];
            for (int i = 1; i < authors.length; i++) {
                ans+=",";
                ans+=authors[i];
            }
        }
        return ans;
    }
}
