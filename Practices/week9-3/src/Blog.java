public class Blog extends Subject {
    private StringBuffer buf;

    public Blog() {
        buf = new StringBuffer();
    }

    public void changeContent(String content) {
        buf.append(content);
        notifyObservers();
    }

    public String getContent() {
        return buf.toString();
    }
}
