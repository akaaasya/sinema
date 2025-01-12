package sinema;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Film extends BaseEntity {
    private int sure;
    private String tur;
    private List<String> salonlar;

    public Film(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("sure") int sure,
            @JsonProperty("tur") String tur, @JsonProperty("salonlar") List<String> salonlar) {
    super(id, name);
    this.sure = sure;
    this.tur = tur;
    this.salonlar = salonlar;
}
    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public List<String> getSalonlar() {
        return salonlar;
    }

    public void setSalonlar(List<String> salonlar) {
        this.salonlar = salonlar;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Film Adı: " + getName());
        System.out.println("Süre: " + sure + " dakika");
        System.out.println("Tür: " + tur);
        System.out.println("Salonlar: " + salonlar);
    }
}
