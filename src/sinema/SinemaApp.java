package sinema;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class SinemaApp {

    public static void main(String[] args) {
        try {
           
            Film film1 = new Film("1", "Matrix", 120, "Bilim Kurgu", List.of("Salon 1", "Salon 2"));
            Film film2 = new Film("2", "Titanic", 195, "Romantik", List.of("Salon 1"));

            Salon salon1 = new Salon("1", "Salon 1");
            Salon salon2 = new Salon("2", "Salon 2");

            salon1.filmEkle(film1);
            salon2.filmEkle(film2);

            Musteri musteri1 = new Musteri("101", "Ahmet");
            Musteri musteri2 = new Musteri("102", "Ayşe");

            salon1.kayitEkle(musteri1);
            salon2.kayitEkle(musteri2);

            ObjectMapper objectMapper = new ObjectMapper();

            objectMapper.writeValue(new File("filmler.json"), List.of(film1, film2));
            objectMapper.writeValue(new File("salonlar.json"), List.of(salon1, salon2));
            objectMapper.writeValue(new File("musteriler.json"), List.of(musteri1, musteri2));

           
            salon1.bilgiGoster();
            salon2.bilgiGoster();
            film1.bilgiGoster();
            film2.bilgiGoster();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
