public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.channelUp();
        tv.printStatus();

        Radio radio = new Radio();
        AdvancedRemoteWithMute advancedRemoteWithMute = new AdvancedRemoteWithMute(radio);
        advancedRemoteWithMute.power();
        advancedRemoteWithMute.volumeUp();
        radio.printStatus();
        advancedRemoteWithMute.mute();
        radio.printStatus();
    }
}
