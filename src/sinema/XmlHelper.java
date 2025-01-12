package sinema;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlHelper {
    public void filmElementOlustur(Document doc, Film film) {
        Element filmElement = doc.createElement("Film");

      
        Element filmAdi = doc.createElement("Ad");
        filmAdi.appendChild(doc.createTextNode(film.getName())); // getAd yerine getName kullanın
        filmElement.appendChild(filmAdi);

       
        Element sure = doc.createElement("Sure");
        sure.appendChild(doc.createTextNode(String.valueOf(film.getSure())));
        filmElement.appendChild(sure);

        Element tur = doc.createElement("Tur");
        tur.appendChild(doc.createTextNode(film.getTur()));
        filmElement.appendChild(tur);

     
        Element salonlarElement = doc.createElement("Salonlar");
        for (String salon : film.getSalonlar()) {
            Element salonElement = doc.createElement("Salon");
            salonElement.appendChild(doc.createTextNode(salon));
            salonlarElement.appendChild(salonElement);
        }
        filmElement.appendChild(salonlarElement);

    
        doc.getDocumentElement().appendChild(filmElement);
    }

    public void salonElementOlustur(Document doc, Salon salon) {
        Element salonElement = doc.createElement("Salon");


        Element salonAdi = doc.createElement("Ad");
        salonAdi.appendChild(doc.createTextNode(salon.getName())); // getAd yerine getName kullanın
        salonElement.appendChild(salonAdi);

        if (salon.getFilm() != null) {
            Element filmElement = doc.createElement("Film");
            filmElement.appendChild(doc.createTextNode(salon.getFilm().getName()));
            salonElement.appendChild(filmElement);
        }

   
        Element musterilerElement = doc.createElement("Musteriler");
        for (Musteri musteri : salon.getMusteriler()) {
            Element musteriElement = doc.createElement("Musteri");
            musteriElement.appendChild(doc.createTextNode(musteri.getAd()));
            musterilerElement.appendChild(musteriElement);
        }
        salonElement.appendChild(musterilerElement);

      
        doc.getDocumentElement().appendChild(salonElement);
    }
}
