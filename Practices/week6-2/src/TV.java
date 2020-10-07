public class TV {
    private boolean isPowerOn = false;
    private boolean isMuted = false;

    public void power() {
        isPowerOn = !isPowerOn;

        if (isPowerOn)
            System.out.println("Power On");
        else
            System.out.println("Power Off");
    }

    public void mute() {
        isMuted = !isMuted;

        if (isMuted)
            System.out.println("Mute On");
        else
            System.out.println("Mute Off");
    }
}
