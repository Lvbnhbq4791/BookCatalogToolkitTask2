public class Book {
    String title;  //название книги;
    int releaseYear;  //год выпуска;
    Author author;  //автор;
    int pages;  //количество страниц

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        int price = (int) Math.floor((pages * 3 * Math.sqrt(author.rating)));
        if (price > 250) return price;
        return 0;
    }
}
