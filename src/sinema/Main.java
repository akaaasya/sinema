package sinema;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Film film1 = new Film("1", "Matrix", 120, "Bilim Kurgu", List.of("Salon 1", "Salon 2"));
        Film film2 = new Film("2", "Titanic", 195, "Romantik", List.of("Salon 1", "Salon 2"));


  
        Salon salon1 = new Salon("1", "Salon 1");
        Salon salon2 = new Salon("2", "Salon 2");

   
        salon1.filmEkle(film1);
        salon2.filmEkle(film2);


        Musteri musteri1 = new Musteri("101", "Ahmet");
        Musteri musteri2 = new Musteri("102", "Ayşe");


        salon1.kayitEkle(musteri1);
        salon2.kayitEkle(musteri2);


        System.out.println("\nFilmler:");
        film1.bilgiGoster();
        film2.bilgiGoster();


        System.out.println("\nSalonlar ve Müşteriler:");
        salon1.kayitListele();
        salon2.kayitListele();

        scanner.close();
    }
}
