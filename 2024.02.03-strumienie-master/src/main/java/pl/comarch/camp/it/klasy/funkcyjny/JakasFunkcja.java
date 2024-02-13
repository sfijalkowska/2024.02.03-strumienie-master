package pl.comarch.camp.it.klasy.funkcyjny;

import java.util.function.Function;

public class JakasFunkcja implements Function<Integer, Double> {
    @Override
    public Double apply(Integer integer) {
        //return ((double) integer) / ((double) x);
        return ((double) integer) / ((double) 5);
    }
}
