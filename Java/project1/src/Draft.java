import Quiz.Acronym;

public class Draft {
    public static void main(String[] args) {
        String word = "helo 1st 11 312321132 4fawefew hello";
        Acronym acr = new Acronym(word);

        System.out.println(acr.get());

    }

}


//public class Quiz.Book {
//    private String name;
//    private Quiz.Author author;
//    private double price;
//    private int qty=0;
//
//    public Quiz.Book(String name, Quiz.Author author, double price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//
//    public Quiz.Book(String name, Quiz.Author author, double price, int qty) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.qty = qty;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Quiz.Author getAuthor() {
//        return author;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQty() {
//        return qty;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    @Override
//    public String toString() {
//        return "Quiz.Book[" +
//                "name=" + name +
//                "," + author.toString() +
//                ",price=" + price +
//                ",qty=" + qty +
//                ']';
//    }
//}
