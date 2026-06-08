public class Book {
    String title;
    int page;
    Book(String title, int page){
        this.title = title;
        this.page = page;
    }
    String getBookInfo(){
        return this.title + " (" + this.page + ")";
    }
}
