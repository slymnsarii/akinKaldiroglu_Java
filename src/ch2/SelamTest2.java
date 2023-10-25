package ch2;

public class SelamTest2 {
    public static void main(String[] args) {
        Selam2 nesne = new Selam2();

        String cevap = nesne.selamSoyle2("Ali");
        System.out.println(cevap);

        cevap = nesne.selamSoyle2("Zeynep");
        System.out.println(cevap);
        System.out.println("World : " + nesne.world);

        cevap = nesne.selamSoyle2("");
        System.err.println(cevap);
    }
}

class Selam2{

    String world = "millet";

    public String selamSoyle2(String kime) {
        String cumle;
        if (kime != "")
            cumle = "Selam " + kime + " :)";
        else
            cumle = "Selam " + world + " :)";
        return cumle;
    }
}
