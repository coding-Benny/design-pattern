import java.util.Optional;

public class TicketManager {
    /* TicketManager를 static으로 만들어 하나의 공유 객체로 만든다. */
    private static TicketManager instance = null;
    private int count;
    private final int LIMITS = 2;
    /* 생성자를 private으로 만들어 외부에서 함부로 생성하지 못하도록 한다. */
    private TicketManager() {
        count = 0;
    }

    /*
     * TicketManager를 method를 통해서만 생성하도록 한다.
     * 이미 생성되어 있다면 기존 instance를 사용하기 위해 불러온다.
     */
    public static TicketManager getInstance() {
        if (instance == null) instance = new TicketManager();
        return instance;
    }

    public Optional<Ticket> issue() {
        if (count >= LIMITS) return Optional.empty();
        return Optional.of(new Ticket(count++));
    }
}
