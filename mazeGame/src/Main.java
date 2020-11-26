import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        MazeGame hardMazeGame = new HardMazeGame();
        Maze maze = hardMazeGame.createMaze();

        MazeController controller = MazeController.getInstance();
        controller.setMaze(maze);
        controller.setVisible(true);
        controller.setSize(new Dimension(300, 200));
        controller.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
