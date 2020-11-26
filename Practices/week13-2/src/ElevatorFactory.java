public class ElevatorFactory {
    public static Elevator createElevator(VendorID vendorID) {
        Elevator elevator = null;
        switch (vendorID) {
            case LG:
                elevator = new LGElevator();
                break;
            case HYUNDAI:
                elevator = new HyundaiElevator();
                break;
        }
        return elevator;
    }
}
