package pl.comarch.camp.it.klasy.strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Mamy liste intów
szykamy tylko wiekszych od 3 i mniejszych od 10
nie interesują nas duplikaty
chemy dostać czwartą liczbę
 */
public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> liczby = Arrays.asList(4,2,65,4,56,8,5,56,98,5,9,8,5,98,8,65,8,54,65,9,56,87,56,6);


        //PETLE
        List<Integer> liczby2 = new ArrayList<>();
        for(int element : liczby) {
            if(element > 3 && element < 10 && !liczby2.contains(element)) {
                liczby2.add(element);
            }
        }
        System.out.println(liczby2.get(3));

        System.out.println("----------------------");
        //STUMIENI
        int result = liczby.stream()
                .filter(i -> i > 3)
                .filter(i -> i < 10)
                .distinct()
                .skip(3)
                .findFirst()
                .get();
        System.out.println(result);
    }
}
