abstract public class Robot {
    private String name;

    public Robot(String name) { this.name = name; }

    public String getName() { return name; }

    abstract public void move();
    abstract public void attack();
}
