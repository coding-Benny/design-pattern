public class ElevatorCreator {
    public static Elevator assembleElevator(VendorID vendorID) {
        Elevator elevator = ElevatorFactory.createElevator(vendorID);
        Motor motor = MotorFactory.createMotor(vendorID);
        elevator.setMotor(motor);
        Door door = DoorFactory.createDoor(vendorID);
        elevator.setDoor(door);
        motor.setDoor(door);
        DirectionLamp lamp = LampFactory.createLamp(vendorID);
        elevator.setLamp(lamp);
        return elevator;
    }

    public static void main(String[] args) {
        Elevator elevator = assembleElevator(VendorID.HYUNDAI);
        elevator.move(Direction.UP);
    }
}
