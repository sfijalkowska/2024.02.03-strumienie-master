package pl.comarch.camp.it.klasy.funkcyjny;

import pl.comarch.camp.it.klasy.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;

        String s = function.apply(5);
        System.out.println(s);
        System.out.println(function.apply(10));
        System.out.println(function.apply(15));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();

        System.out.println(biFunction.apply("asdf", "asdfasdddd"));
        System.out.println(biFunction.apply("Mateusz", "Bereda"));
        System.out.println(biFunction.apply("Janusz", "Kowalski"));
        System.out.println(biFunction.apply("Wiesiek", "Malinowski"));

        UnaryOperator<Integer> unaryOperator = i -> i * 100;

        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(13));
        System.out.println(unaryOperator.apply(50));

        Predicate<Car> predicate = car -> {
            if(car.getBrand().equals("BMW")) {
                return car.getPrice() > 450;
            }
            return car.getPrice() > 350;
        };

        System.out.println(predicate.test(new Car("BMW", "5", 400)));
        System.out.println(predicate.test(new Car("Toyota", "Corolla", 160)));
        System.out.println(predicate.test(new Car("Porsche", "911", 900)));

        Supplier<Car> defaultCarSupplier = () -> new Car("default", "default", 0);

        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("Kia", "Ceed", 150));
        consumer.accept(defaultCarSupplier.get());

        int x = 5;
        Function<Integer, Double> naszaFunkcja = integer -> ((double) integer) / ((double) x);

        /*naszaFunkcja.apply(5);
        x = 7;
        naszaFunkcja.apply(5);*/

        Function<Integer, Double> naszaFunkcja2 = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return ((double) integer) / ((double) x);
            }
        };

        Function<Integer, Double> naszaFunkcja3 = new JakasFunkcja();

        Supplier<Integer> supplier = App::metoda2;

        supplier.get();
        App.metoda2();
    }

    public static void metoda() {
        System.out.println("cos");
    }

    public static int metoda2() {
        return 5;
    }
}
