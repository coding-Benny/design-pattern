public class Book {
    private Long id; // 필수
    private String isbn; // 필수
    private String title;
    private String author;
    private int pages;
    private String category;

    /* Telescoping Constructor Pattern : 인자가 많을수록 생성자도 늘어남 */
    public Book(Long id, String isbn) {
        this.id = id;
        this.isbn = isbn;
    }

    public Book(Long id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    public Book(Long id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Long id, String isbn, String title, String author, int pages) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(Long id, String isbn, String title, String author, int pages, String category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
    }
}
