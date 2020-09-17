import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        TicketManager tm = new TicketManager();
        int serialNum;
        Optional<Ticket> t1 = tm.issue();
        serialNum = t1.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);
        Optional<Ticket> t2 = tm.issue();
        serialNum = t2.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);
        Optional<Ticket> t3 = tm.issue();
        serialNum = t3.map(Ticket::getSerialNum).orElse(-1);
        System.out.println(serialNum);
    }
}
