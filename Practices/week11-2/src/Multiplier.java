public class Multiplier extends Calculator {
       @Override
    protected int initVal() {
        return 1;
    }

    @Override
    protected int tempVal(int tot, int i) {
        return tot * i;
    }
}
