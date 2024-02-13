package pl.comarch.camp.it.klasy.strumienie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,6,13,7,8,9,2,6,2,13,15);

        List<String> list1 = list.stream()
                .map(i -> "Liczba: " + i)
                .toList();
        System.out.println(list1);

        OptionalDouble avrBox = list.stream()
                .mapToInt(i -> i)
                .average();
        System.out.println(avrBox.getAsDouble());
    }
}
