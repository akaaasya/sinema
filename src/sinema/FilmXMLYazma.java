package sinema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class FilmXMLYazma {
    public static void main(String[] args) {
        try {
           
            Film film = new Film("1", "Matrix", 120, "Bilim Kurgu", List.of("Salon1", "Salon2"));
            
            film.setName("Matrix"); 
            film.setSure(120);
            film.setTur("Bilim Kurgu");

         
            JAXBContext context = JAXBContext.newInstance(Film.class);

          
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        
            marshaller.marshal(film, new File("film.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
