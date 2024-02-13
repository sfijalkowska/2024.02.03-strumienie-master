package pl.comarch.camp.it.klasy.funkcyjny;

@FunctionalInterface
public interface TriFunction <T, W, S, Z> {
    Z apply(T t, W w, S s);
}
