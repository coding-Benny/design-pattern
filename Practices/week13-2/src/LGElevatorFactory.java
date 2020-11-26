public class LGElevatorFactory extends ElevatorAbstractFactory {
    @Override
    public Elevator createElevator() {
        return new LGElevator();
    }

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }

    @Override
    public DirectionLamp createLamp() {
        return new LGLamp();
    }
}
