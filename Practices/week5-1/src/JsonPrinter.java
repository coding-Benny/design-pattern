import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Set;

public class JsonPrinter extends PBookPrinter {
    @Override
    public void print() {
        JSONObject jsonObject = new JSONObject();
        JSONObject bookJson = new JSONObject();
        JSONArray entries = new JSONArray();
        Set keySet = this.getBook().getKeySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            JSONObject entry = new JSONObject();
            String nameKey = (String) iterator.next();
            entry.put("name", nameKey);
            String value = this.getBook().getNumber(nameKey);
            String[] pnumbers = value.split(";");
            if (pnumbers.length == 1) entry.put("number", pnumbers[0]);
            else {
                JSONArray numbers = new JSONArray();
                for (int i = 0; i < pnumbers.length; i++) {
                    numbers.add(pnumbers[i]);
                }
            }
        }
    }
}
