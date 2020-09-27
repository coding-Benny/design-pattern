public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1L, "isbn1234", "Design Pattern", "Insang Chung", 360, "CE");
        Book book2 = new Book(1L, "isbn1234", "Insang Chung", "Design Pattern", 360, "CE"); // 인자 타입만 일치하면 잘못된 값을 넣어도 문제되지 않음
        Book book3 = new Book(1L, "isbn1234", null, null, 0, "CE"); // 가독성이 떨어져 프로그램 이해가 힘듦
    }
}
