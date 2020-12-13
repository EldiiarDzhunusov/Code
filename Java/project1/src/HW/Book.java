package HW;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty =0;

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
        return authors;
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
        String author = "authors={";
        int cond = 0;
        for (int i = 0; i < authors.length; i++) {
            if(cond!=0){
                author+=",";
            }
            cond=1;
            author+=authors[i].toString();

        }
        return "HW.Book[" +
                "name='" + name + '\'' +
                "," + author+
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }
    public String getAuthorsNames(){
        String ans="";
        int cond = 0;
        for (int i = 0; i < authors.length; i++) {
            if(cond!=0){
                ans+=",";
            }
            cond=1;
            ans+=authors[i].getName();
        }
        return ans;
    }
}
