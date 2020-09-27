public class Book {
    private Long id; // 필수
    private String isbn; // 필수
    private String title;
    private String author;
    private int pages;
    private String category;

    /* JavaBeans Pattern : setter method로 속성 값을 설정하여 가독성은 향상되나 immutable object를 만들 수 없음 */
    public Book(Long id, String isbn) {
        this.id = id;
        this.isbn = isbn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
