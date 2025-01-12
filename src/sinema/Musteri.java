package sinema;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Musteri extends BaseEntity {
    private String ad;

    public Musteri(@JsonProperty("id") String id, @JsonProperty("ad") String ad) {
        super(id, ad);
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri Adı: " + getName());
    }
}
