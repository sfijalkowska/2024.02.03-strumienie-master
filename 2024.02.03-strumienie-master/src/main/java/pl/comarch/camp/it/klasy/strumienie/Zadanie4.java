package pl.comarch.camp.it.klasy.strumienie;

import java.util.List;

/*
Stwórz listę stringów ( 10 dowolnych stringów)
napisz program który wyświetla jaka jest średnia długość stringów które nie zawierają
spacji i wielkich liter po usunięciu ze stringów kropek i przecinków.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "janusz",
                "jakis string",
                "jak, asdf",
                "asdOasd",
                "asdASD asd",
                "asdf.asd",
                "asdf.asdf,asdf",
                "Asdf.asdf",
                "fasd.asdf asdf",
                "asdf, asdf",
                "asdASD,Aasdf"
        );

        double result = strings.stream()
                .filter(s -> s.equals(s.toLowerCase()))
                .filter(s -> !s.contains(" "))
                .map(s -> s.replaceAll("[\\.,]", ""))
                .mapToInt(String::length)
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
