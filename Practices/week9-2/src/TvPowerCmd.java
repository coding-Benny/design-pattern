public class TvPowerCmd implements Command {
    private Tv tv;

    public TvPowerCmd(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
