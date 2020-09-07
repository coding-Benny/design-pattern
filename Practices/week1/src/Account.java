public class Account {
    private String owner;
    private int balance;
    private Logger myLogger;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        /*
         * Account 인스턴스가 생성될 때마다
         * 새로운 Logger 인스턴스를 생성하는 문제점을 해결하기 위해
         * this.myLogger = new Logger(); 삭제
         */
    }

    public String getOwner() { return owner; }
    public int getBalance() { return balance; }

    public void deposit(int money) {
        myLogger.log("owner : " + this.getOwner() + " deposit " + money);
        balance += money;
    }

    public void withdraw(int money) {
        if (balance >= money) {
            myLogger.log("owner: " + this.getOwner() + " withdraw " + money);
            balance -= money;
        }
    }

    /* 모든 Account 인스턴스가 하나의 Logger 인스턴스를 공유하도록 설계 */
    public void setMyLogger(Logger myLogger) {
        this.myLogger = myLogger;
    }
}
