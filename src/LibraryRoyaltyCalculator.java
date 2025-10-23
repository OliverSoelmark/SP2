public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author a1 = new Author("J.K Rowling");
        PrintedBook book1 = new PrintedBook("Harry Potter 1","SKØN",2000,365);
        PrintedBook book2 = new PrintedBook("Harry Potter 2", "SKØN", 1000,400);
        AudioBook book3 = new AudioBook("Harry Potter 3","SKØN", 3000,160);

        a1.addTitle(book1);
        a1.addTitle(book2);
        a1.addTitle(book3);

        System.out.printf("Author: %s, Royalties: %skr.", a1.getName(), String.format(java.util.Locale.US, "%.2f", a1.calculateRoyalties()));
    }
}
