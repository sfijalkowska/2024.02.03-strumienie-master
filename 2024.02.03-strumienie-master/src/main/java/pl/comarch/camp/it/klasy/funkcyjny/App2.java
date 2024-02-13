package pl.comarch.camp.it.klasy.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        readAndProcess(App2::readDataFromFile, App2::processA1);

        readAndProcess(App2::readDataFromNetwork, App2::processA3);

        readAndProcess(App2::readDataFromNetwork, App2::processA2);

        readAndProcess(App2::readDataFromDb, App2::processA1);
    }

    private static int readDataFromFile() {
        System.out.println("Wczytuje dane z pliku !!");
        return 5;
    }

    private static int readDataFromDb() {
        System.out.println("Wczytuje dane z bazy !!");
        return 10;
    }

    private static int readDataFromNetwork() {
        System.out.println("Wczytuje dane z internetu !!");
        return 15;
    }

    private static int processA1(int x) {
        System.out.println("Algorytm 1");
        return x * 10;
    }

    private static int processA2(int x) {
        System.out.println("Algorytm 2");
        return x * 100;
    }

    private static int processA3(int x) {
        System.out.println("Algorytm 3");
        return x * 1000;
    }

    public static int readFormFileAndA1() {
        int x = readDataFromFile();
        return processA1(x);
    }

    public static int readFormDbAndA3() {
        int x = readDataFromDb();
        return processA3(x);
    }

    public static int readAndProcess(Supplier<Integer> dataReader, UnaryOperator<Integer> processor) {
        int x = dataReader.get();
        return processor.apply(x);
    }
}
