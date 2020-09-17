import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private final String LOGFILE = "log.txt";
    private PrintWriter writer;
    private volatile static Logger instance;

    private Logger() {
        try {
            FileWriter fw = new FileWriter(LOGFILE);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) { }
    }

    /*
     * Eager Initialization은 필요하지 않은 경우에도 인스턴스를 생성하였으나
     * Lazy Holder를 사용하면 getInstance()를 호출해야 생성됨
     */
    private static  class LazyHolder {
        public static final Logger INSTANCE = new Logger();
    }

    public static synchronized Logger getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void log (String message) {
        /* 다중 스레드 환경에서는 인스턴스가 여러 개 생기는 문제점 발생 */
        System.out.println(this.toString());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        writer.println(formatter.format(date) + " : " + message);
    }
}
