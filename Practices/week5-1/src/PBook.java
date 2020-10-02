import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

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

    public void printInXml() {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}