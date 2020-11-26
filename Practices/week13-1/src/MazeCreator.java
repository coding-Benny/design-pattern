import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public abstract class MazeCreator {

    public Maze createMaze() {
        Maze maze = new Maze();

        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Room room3 = makeRoom(3);
        Room room4 = makeRoom(4);
        Room room5 = makeRoom(5);
        Room room6 = makeRoom(6);

        Door door1 = makeDoor(room1, room3);
        Door door2 = makeDoor(room2, room3);
        Door door3 = makeDoor(room3, room4);
        Door door4 = makeDoor(room2, room5);
        Door door5 = makeDoor(room5, room6);
        Door door6 = makeDoor(room3, room6);

        room1.setSide(Direction.NORTH, createWall());
        room1.setSide(Direction.EAST, door1);
        room1.setSide(Direction.SOUTH, createWall());
        room1.setSide(Direction.WEST, createWall());

        room2.setSide(Direction.NORTH, createWall());
        room2.setSide(Direction.EAST, door4);
        room2.setSide(Direction.SOUTH, door2);
        room2.setSide(Direction.WEST, createWall());

        room3.setSide(Direction.NORTH, door2);
        room3.setSide(Direction.EAST, door6);
        room3.setSide(Direction.SOUTH, door3);
        room3.setSide(Direction.WEST, door1);

        room4.setSide(Direction.NORTH, door3);
        room4.setSide(Direction.EAST, createWall());
        room4.setSide(Direction.SOUTH, createWall());
        room4.setSide(Direction.WEST, createWall());

        room5.setSide(Direction.NORTH, createWall());
        room5.setSide(Direction.EAST, createWall());
        room5.setSide(Direction.SOUTH, door5);
        room5.setSide(Direction.WEST, door4);

        room6.setSide(Direction.NORTH, door5);
        room6.setSide(Direction.EAST, createWall());
        room6.setSide(Direction.SOUTH, createWall());
        room6.setSide(Direction.WEST, door6);

        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);
        maze.addRoom(room6);

        maze.setCurrentRoom(1);

        return maze;
    }

    protected abstract MapSite createWall();

    protected abstract Door makeDoor(Room room1, Room room2);

    public abstract Room makeRoom(int i);

    public Maze makeMaze() { return new Maze(); }

    public static void main(String[] args) {
        MazeCreator mazeCreator = new MyMazeGame();
        Maze maze = mazeCreator.createMaze();
        MazeController controller = MazeController.getInstance();
        controller.setMaze(maze);
        controller.setVisible(true);
        controller.setSize(new Dimension(300, 200));
        controller.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
