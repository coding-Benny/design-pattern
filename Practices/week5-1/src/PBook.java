import java.util.HashMap;
import java.util.Set;

public class PBook {
    private HashMap<String, String> entries = new HashMap<String, String>();
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public void addNumber(String name, String number) {
        String num1;
        num1 = getNumber(name);
        if (num1 != null) num1 += "; " + number;
        else num1 = number;
        entries.put(name, num1);
    }

    public String getNumber(String name) {
        return entries.get(name);
    }

    public Set getKeySet() {
        return entries.keySet();
    }
}