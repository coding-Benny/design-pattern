public class Main {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        Bird bird = new Bird();
        Command cmd1 = new BirdSingCmd(bird);
        menuItem.setCmd(cmd1);
        menuItem.buttonPressed();
        Tv tv = new Tv();
        Command cmd2 = new TvPowerCmd(tv);
        menuItem.setCmd(cmd2);
        menuItem.buttonPressed();
        FileNew f = new FileNew();
        Command cmd3 = new FileNewCmd(f);
        menuItem.setCmd(cmd3);
        menuItem.buttonPressed();
    }
}
