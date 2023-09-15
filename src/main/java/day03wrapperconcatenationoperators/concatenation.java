package day03wrapperconcatenationoperators;

public class concatenation {
    public static void main(String[] args) {
        // ornek 1:  Bir string ve iki integer variable olusturunuz.string degeri ile Integer lerin
        // toplamini konsola yazdiriniz

        String s ="elma";
       int a = 10;
       int b = 11;

        System.out.println(s+a+b);
        System.out.println(s+a*b); // elma 110
        System.out.println(s+(a+b));// elma 21
        System.out.println(a+b+s);//21 elma
        System.out.println(a+s+b);//10elma11

    }
}
