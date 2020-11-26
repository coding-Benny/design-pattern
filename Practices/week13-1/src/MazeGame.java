public abstract class MazeGame {
    public Maze createMaze() {
        Maze maze = new Maze();

        Room room1 = createRoom(1, false);
        Room room2 = createRoom(2, false);
        Room room3 = createRoom(3, false);
        Room room4 = createRoom(4, true);
        Room room5 = createRoom(5, false);
        Room room6 = createRoom(6, false);

        Door door1 = createDoor(room1, room3, "insang1");
        Door door2 = createDoor(room2, room3, "");
        Door door3 = createDoor(room3, room4, "");
        Door door4 = createDoor(room2, room5, "");
        Door door5 = createDoor(room5, room6, "insang2");
        Door door6 = createDoor(room3, room6, "");

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

    public abstract Room createRoom(int roomNumber, boolean hasBomb);
    public abstract Door createDoor(Room room1, Room room2, String correctKey);
    public abstract Wall createWall();
}
