public class TestaAr {

    public static void main(String[] args) {

        ArCondicionado ar1 = new ArCondicionado("Samsung", "Duo Boost", 24, true);
        System.out.println(ar1);
        System.out.println("\n");
        ar1.ativarModoTurbo();
        System.out.println();

    }
}