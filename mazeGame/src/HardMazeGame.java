
public class HardMazeGame extends MazeGame {
    public static Maze createMaze1() {
        Maze maze = new Maze(); // 미로 생성

        Room room1 = new Room(1);   // 방 6개 생성
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new Room(4);
        Room room5 = new Room(5);
        Room room6 = new Room(6);

        Door door1 = new Door(room1, room3);    // 방 사이에 문 생성
        Door door2 = new Door(room2, room3);
        Door door3 = new Door(room3, room4);
        Door door4 = new Door(room2, room5);
        Door door5 = new Door(room5, room6);
        Door door6 = new Door(room3, room6);

        room1.setSide(Direction.NORTH, new Wall()); // 방의 북쪽에 벽 생성
        room1.setSide(Direction.EAST, door1);   // 동쪽에 문
        room1.setSide(Direction.SOUTH, new Wall()); // 남쪽에 벽
        room1.setSide(Direction.WEST, new Wall());  // 서쪽에 벽

        room2.setSide(Direction.NORTH, new Wall()); // 북쪽에 벽
        room2.setSide(Direction.EAST, door4);   // 동쪽에 문
        room2.setSide(Direction.SOUTH, door2);  // 남쪽에 문
        room2.setSide(Direction.WEST, new Wall());  // 서쪽에 벽

        room3.setSide(Direction.NORTH, door2);
        room3.setSide(Direction.EAST, door6);
        room3.setSide(Direction.SOUTH, door3);
        room3.setSide(Direction.WEST, door1);

        room4.setSide(Direction.NORTH, door3);
        room4.setSide(Direction.EAST, new Wall());
        room4.setSide(Direction.SOUTH, new Wall());
        room4.setSide(Direction.WEST, new Wall());

        room5.setSide(Direction.NORTH, new Wall());
        room5.setSide(Direction.EAST, new Wall());
        room5.setSide(Direction.SOUTH, door5);
        room5.setSide(Direction.WEST, door4);

        room6.setSide(Direction.NORTH, door5);
        room6.setSide(Direction.EAST, new Wall());
        room6.setSide(Direction.SOUTH, new Wall());
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
    public static Maze createMaze2() {
        Maze maze = new Maze();

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new RoomWithBomb(4);
        Room room5 = new Room(5);
        Room room6 = new Room(6);

        Door door1 = new SecretDoor(room1, room3, "insang1");
        Door door2 = new Door(room2, room3);
        Door door3 = new Door(room3, room4);
        Door door4 = new Door(room2, room5);
        Door door5 = new SecretDoor(room5, room6, "insang2");
        Door door6 = new Door(room3, room6);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, door1);
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, new Wall());

        room2.setSide(Direction.NORTH, new Wall());
        room2.setSide(Direction.EAST, door4);
        room2.setSide(Direction.SOUTH, door2);
        room2.setSide(Direction.WEST, new Wall());

        room3.setSide(Direction.NORTH, door2);
        room3.setSide(Direction.EAST, door6);
        room3.setSide(Direction.SOUTH, door3);
        room3.setSide(Direction.WEST, door1);

        room4.setSide(Direction.NORTH, door3);
        room4.setSide(Direction.EAST, new Wall());
        room4.setSide(Direction.SOUTH, new Wall());
        room4.setSide(Direction.WEST, new Wall());

        room5.setSide(Direction.NORTH, new Wall());
        room5.setSide(Direction.EAST, new Wall());
        room5.setSide(Direction.SOUTH, door5);
        room5.setSide(Direction.WEST, door4);

        room6.setSide(Direction.NORTH, door5);
        room6.setSide(Direction.EAST, new Wall());
        room6.setSide(Direction.SOUTH, new Wall());
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
    /* public static Maze createMaze3() {
        MazeFactory mazeFactory = MazeFactory.getInstance();
        Maze maze = mazeFactory.createMaze();

        Room room1 = mazeFactory.createRoom(1, false);
        Room room2 = mazeFactory.createRoom(2, false);
        Room room3 = mazeFactory.createRoom(3, false);
        Room room4 = mazeFactory.createRoom(4, true);
        Room room5 = mazeFactory.createRoom(5, false);
        Room room6 = mazeFactory.createRoom(6, false);

        Door door1 = mazeFactory.createDoor(room1, room3, "insang1");
        Door door2 = mazeFactory.createDoor(room2, room3, null);
        Door door3 = mazeFactory.createDoor(room3, room4, null);
        Door door4 = mazeFactory.createDoor(room2, room5, null);
        Door door5 = mazeFactory.createDoor(room5, room6, "insang2");
        Door door6 = mazeFactory.createDoor(room3, room6, null);

        room1.setSide(Direction.NORTH, mazeFactory.createWall());
        room1.setSide(Direction.EAST, door1);
        room1.setSide(Direction.SOUTH, mazeFactory.createWall());
        room1.setSide(Direction.WEST, mazeFactory.createWall());

        room2.setSide(Direction.NORTH, mazeFactory.createWall());
        room2.setSide(Direction.EAST, door4);
        room2.setSide(Direction.SOUTH, door2);
        room2.setSide(Direction.WEST, mazeFactory.createWall());

        room3.setSide(Direction.NORTH, door2);
        room3.setSide(Direction.EAST, door6);
        room3.setSide(Direction.SOUTH, door3);
        room3.setSide(Direction.WEST, door1);

        room4.setSide(Direction.NORTH, door3);
        room4.setSide(Direction.EAST, mazeFactory.createWall());
        room4.setSide(Direction.SOUTH, mazeFactory.createWall());
        room4.setSide(Direction.WEST, mazeFactory.createWall());

        room5.setSide(Direction.NORTH, mazeFactory.createWall());
        room5.setSide(Direction.EAST, mazeFactory.createWall());
        room5.setSide(Direction.SOUTH, door5);
        room5.setSide(Direction.WEST, door4);

        room6.setSide(Direction.NORTH, door5);
        room6.setSide(Direction.EAST, mazeFactory.createWall());
        room6.setSide(Direction.SOUTH, mazeFactory.createWall());
        room6.setSide(Direction.WEST, door6);

        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);
        maze.addRoom(room6);

        maze.setCurrentRoom(1);
        return maze;
    } */

    @Override
    public Room createRoom(int roomNumber, boolean hasBomb) {
        if (hasBomb) return new RoomWithBomb(roomNumber);
        else return new Room(roomNumber);
    }

    @Override
    public Door createDoor(Room room1, Room room2, String correctKey) {
        if (correctKey.length() <= 0) return new Door(room1, room2);
        else return new SecretDoor(room1, room2, correctKey);
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }
}
