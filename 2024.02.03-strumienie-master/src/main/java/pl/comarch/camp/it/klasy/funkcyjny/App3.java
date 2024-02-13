package pl.comarch.camp.it.klasy.funkcyjny;

public class App3 {
    public static void main(String[] args) {
        MojaFunkcja mojaFunkcja = s -> Integer.parseInt(s)+10;
        System.out.println(mojaFunkcja.cos("17"));

        MojaFunkcja mojaFunkcja2 = new MojaFunkcja() {
            @Override
            public int cos(String s) {
                return Integer.parseInt(s)+10;
            }
        };

        TriFunction<Integer, Integer, Integer, String> triFunction = (x,y,z) -> x+y+z + "";
        System.out.println(triFunction.apply(3,5,7));
    }
}
