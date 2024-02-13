package pl.comarch.camp.it.klasy.strumienie;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
                .peek(System.out::println)
                .filter(i -> i > 3)
                .peek(System.out::println)
                .filter(i -> i < 8)
                .peek(System.out::println)
                .limit(1)
                .forEach(System.out::println);
    }
}
