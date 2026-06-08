public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    String getLibraryInfo(){
        return this.year + " " + this.name;
    }

    void printBooks(){
        for(Book book : books){
            System.out.println(book.getBookInfo());
        }
    }

}
