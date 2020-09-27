public class Book {
    private Long id; // 필수
    private String isbn; // 필수
    private String title;
    private String author;
    private int pages;
    private String category;

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public static class BookBuilder {
        private Long id; // 필수
        private String isbn; // 필수
        private String title;
        private String author;
        private int pages;
        private String category;

        /* Builder Pattern : 가독성이 좋고 immutable 객체를 생성할 수 있으나 코드 양이 상당히 증가함 */
        public BookBuilder(Long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public BookBuilder category(String category) {
            this.category = category;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.id = this.id;
            book.isbn = this.isbn;
            book.author = this.author;
            book.title = this.title;
            book.pages = this.pages;
            book.category = this.category;
            return book;
        }
    }
}
