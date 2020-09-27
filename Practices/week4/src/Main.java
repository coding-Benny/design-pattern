public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder(1L, "isbn1234").author("Insang Chung").build();
        Book book2 = new Book.BookBuilder(2L, "isbn2345").pages(360).author("Insang Chung").build(); // 인자의 순서 중요하지 않음
        System.out.println(book2.getAuthor());
    }
}
