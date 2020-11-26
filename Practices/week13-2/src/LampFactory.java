public class LampFactory {
    public static DirectionLamp createLamp(VendorID vendorID) {
        DirectionLamp lamp = null;
        switch (vendorID) {
            case LG:
                lamp = new LGLamp();
                break;
            case HYUNDAI:
                lamp = new HyundaiLamp();
                break;
        }
        return lamp;
    }
}
