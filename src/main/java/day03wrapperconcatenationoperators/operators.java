package day03wrapperconcatenationoperators;

public class operators {
    public static void main(String[] args) {
        int kisiSayisi=10;
        int paraMiktari=25;
        System.out.println(paraMiktari/kisiSayisi);

        int ogrenciSayisi=10;
        double ucretMiktari=25;
        System.out.println(ucretMiktari/ogrenciSayisi);

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;
        System.out.println(first&&second);
        System.out.println(first||second||third);
    }
}
