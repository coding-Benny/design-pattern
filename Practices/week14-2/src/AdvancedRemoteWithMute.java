public class AdvancedRemoteWithMute extends BasicRemote {
    public AdvancedRemoteWithMute(Device device) {
        super(device);
    }
    
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
