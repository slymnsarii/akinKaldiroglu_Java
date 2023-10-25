package ch1;

public class SelamTest {

    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("Zeynep");
        System.out.println(cevap);
        System.out.println("World : " + nesne.world);

        cevap = nesne.selamSoyle("");
        System.err.println(cevap);
    }
}



/*
Selam ve SelamTest birer sınıftır, tiptir.
Selam sınıfının nesnesini SelamTest'in içindeki main'de oluşturduk nesneyi kullandık.Nesnenin hizmetini, bilgisini alıyoruz.
 */
