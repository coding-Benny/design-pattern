public class Main {
    public static void main(String[] args) {
        PBook book = new PBook();
        book.addNumber("insang1", "010-123-1234");
        book.addNumber("insang1", "010-123-1234");
        book.addNumber("insang2", "010-1234-1234");
        book.addNumber("insang3", "010-1230-1234");
        book.addNumber("insang3", "010-1231-1234");
        book.addNumber("insang3", "010-1232-1234");
        book.printInXml();
    }
}