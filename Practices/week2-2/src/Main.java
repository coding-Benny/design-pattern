import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        TicketManager tm = TicketManager.getInstance();
        int serialNum;
        Optional<Ticket> t1 = tm.issue();
        serialNum = t1.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);
        Optional<Ticket> t2 = tm.issue();
        serialNum = t2.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);

        /*
         * 기존의 방식으로는 새로운 TicketManager를 생성하여 이미 발행했던 serial number가 나타났지만,
         * singleton design pattern을 사용함으로써 기존 인스턴스를 이용할 수 있게 되었다.
         */
        TicketManager tm2 = TicketManager.getInstance();
        Optional<Ticket> t3 = tm2.issue();
        serialNum = t3.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);
    }
}
