package sinema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XMLUtil {

    // XML'e yazma işlemi
    public static void writeToXML(List<Salon> salonlar, String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Salon.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(salonlar, new File(fileName));
    }

    // XML'den okuma işlemi
    public static List<Salon> readFromXML(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Salon.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (List<Salon>) unmarshaller.unmarshal(new File(fileName));
    }
}
