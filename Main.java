import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Евгений", "Петров", 15);
        Book book1 = new Book("Вессеняя Пора", 2025, author1, 300);
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // слово для проверки в описании книги
        displayInformationAboutBook(book1, word);
    }

    // Метод для вывода информации о книге
    public static void displayInformationAboutBook(Book book, String word) {
        System.out.println("Является ли книга большой: " + book.isBig());
        System.out.println("Содержится ли в описании книги слово " + "\"" + word + "\" : " + book.matches(word));
        System.out.println("Cтоимости книги: " + book.estimatePrice() + " руб.");
    }
}