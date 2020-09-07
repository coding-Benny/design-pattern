public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Account acct1 = new Account("insang1", 1000000);
        acct1.setMyLogger(logger);  /* 생성된 logger를 설정 */
        acct1.deposit(20000);
        Account acct2 = new Account("insang2", 2000000);
        acct2.setMyLogger(logger);  /* 동일한 logger를 설정 */
        acct2.withdraw(5000);
    }
}
