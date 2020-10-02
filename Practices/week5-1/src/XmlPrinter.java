import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.Iterator;
import java.util.Set;

public class XmlPrinter extends PBookPrinter {
    @Override
    public void print() {
        try {
            Set keySet = this.getBook().getKeySet();
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            doc.setXmlStandalone(true);

            Element pbook = doc.createElement("PhoneBook");
            doc.appendChild(pbook);

            Iterator iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Element entry = doc.createElement("entry");
                pbook.appendChild(entry);
                Element name = doc.createElement("name");
                String nameKey = (String) iterator.next();
                name.appendChild(doc.createTextNode(nameKey));
                entry.appendChild(name);
                String value = this.getBook().getNumber(nameKey);
                String[] pnumbers = value.split(";");

                for (int i = 0; i < pnumbers.length; i++) {
                    Element number = doc.createElement("number");
                    number.appendChild(doc.createTextNode(pnumbers[i]));
                    entry.appendChild(number);
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
