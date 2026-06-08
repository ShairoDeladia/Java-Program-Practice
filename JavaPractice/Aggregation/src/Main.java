public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", 336);
        Book book2 = new Book("1984", 328);
        Book book3 = new Book("The Great Gatsby", 180);
        Book[] books = {book1, book2, book3};
        Library library = new Library("NYC Public Library", 1895, books);
        System.out.println(library.getLibraryInfo()); 
        library.printBooks();
    }
}
