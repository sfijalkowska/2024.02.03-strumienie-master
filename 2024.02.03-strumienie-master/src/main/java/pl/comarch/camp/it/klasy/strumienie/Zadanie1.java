package pl.comarch.camp.it.klasy.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
Mamy liste liczb. Policz średnią tylko parzystych liczb.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> liczby = Arrays.asList(23,242,23,23,324,65,345,564,23,654,732,1,2,345,34,5,2,564);

        // TRADYCYJNIE PETLA
        int sum = 0;
        int evenCounter = 0;
        for(int element : liczby) {
            if(element % 2 == 0) {
                sum += element;
                evenCounter++;
            }
        }

        double avg = (double) sum / evenCounter;
        System.out.println(avg);

        //STRUMIEN
        OptionalDouble avrBox = liczby.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i)
                .average();
        System.out.println(avrBox.getAsDouble());
    }
}
