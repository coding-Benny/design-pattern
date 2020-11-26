public class MyMazeFactory extends MazeFactory {
    @Override
    public Door makeDoor(Room room1, Room room2) {
        if (room1.getRoomNumber() == 1 && room2.getRoomNumber() == 3)
            return new SecretDoor(room1, room2, "insang1");
        if (room1.getRoomNumber() == 5 && room2.getRoomNumber() == 6)
            return new SecretDoor(room1, room2, "insang2");
        return new Door(room1, room2);
    }

    @Override
    public Room makeRoom(int roomNumber) {
        if (roomNumber == 4) return new RoomWithBomb(roomNumber);
        return new Room(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }
}
