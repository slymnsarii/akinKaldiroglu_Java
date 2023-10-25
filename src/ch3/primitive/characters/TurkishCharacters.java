package ch3.primitive.characters;

public class TurkishCharacters {
    public static void main(String[] args) {
        int ı = 8;
        int ğ = 3;

        double ş = şunuHesaplaBakalım(ı, ğ);
        System.out.println("Toplam fiyat: " + ş + '\u20BA');
    }

    public static double şunuHesaplaBakalım(int ö, int ü) {
        int ı = ö + ü;
        double j = ö - ü;
        return ı * j;
    }
}
