public abstract class MazeFactory {
    public abstract Door makeDoor(Room room1, Room room2);
    public abstract Room makeRoom(int roomNumber);
    public abstract Wall makeWall();
    public Maze makeMaze() { return new Maze(); }
}
