

public abstract class PBookPrinter {
    private PBook book;
    public void setBook(PBook book) { this.book = book; }
    public PBook getBook() { return book; }

    abstract public void print();
}
