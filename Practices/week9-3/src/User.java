public class User implements Observer {
    private  String name;
    private Blog blog;

    public User(String name) {
        this.name = name;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void update() {
        String content = blog.getContent();
        System.out.println("User: " + content);
    }
}
