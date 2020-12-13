package Quiz;

public class BookDriver {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Author[] author1 = {new Author("Anton","geagw",'C')};
        Book checkMine = new Book("Java for Dummy", author1, 19.99, 99);


// Declare and allocate a Quiz.Done.Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.println(javaDummy.getAuthors());

        System.out.println("new check");
        System.out.println(checkMine);
    }

}
