public abstract class Calculator {
    public int calc(int n) {
        int tot = initVal();

        for (int i = 1; i <= n; i++) {
            tot = tempVal(tot, i);
        }

        return tot;
    }
    protected abstract int initVal();
    protected abstract int tempVal(int tot, int i);
}
