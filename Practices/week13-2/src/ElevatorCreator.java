

public class ElevatorCreator {
    public static Elevator assembleElevator() {
        Elevator elevator = new LGElevator();
        Motor motor = new LGMotor();
        elevator.setMotor(motor);
        Door door = new LGDoor();
        elevator.setDoor(door);
        motor.setDoor(door);
        DirectionLamp lamp = new LGLamp();
        elevator.setLamp(lamp);
        return elevator;
    }

    public static void main(String[] args) {
        Elevator elevator = assembleElevator();
        elevator.move(Direction.UP);
    }
}
