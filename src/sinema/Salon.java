package sinema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity {
    private List<Musteri> musteriler;
    private Film film;

    public Salon(@JsonProperty("id") String id, @JsonProperty("name") String name) {
        super(id, name);
        this.musteriler = new ArrayList<>();
    }

    public void filmEkle(Film film) {
        this.film = film;
    }

    public void kayitEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public List<Musteri> getMusteriler() {
        return musteriler;
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon Adı: " + getName());
        System.out.println("Film: " + (film != null ? film.getName() : "Henüz belirlenmemiş"));
        System.out.println("Müşteriler: ");
        for (Musteri musteri : musteriler) {
            System.out.println(" - " + musteri.getAd());
        }
    }
    public void kayitListele() {
        System.out.println("Salon: " + getName());
        System.out.println("Film: " + (film != null ? film.getName() : "Henüz belirlenmemiş"));
        System.out.println("Müşteriler: ");
        for (Musteri musteri : musteriler) {
            System.out.println(" - " + musteri.getAd());
        }
    }

    
}
