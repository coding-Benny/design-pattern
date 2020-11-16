public class Adder extends Calculator{
    @Override
    protected int initVal() {
        return 0;
    }

    @Override
    protected int tempVal(int tot, int i) {
        return tot + i;
    }
}
