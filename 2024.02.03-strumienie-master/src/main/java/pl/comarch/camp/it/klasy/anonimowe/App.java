package pl.comarch.camp.it.klasy.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Wiesiek");
        names.add("Janusz");
        names.add("Zbyszek");
        names.add("Adam");
        names.add("Karol");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 100));
        cars.add(new Car("BMW", "3", 150));
        cars.add(new Car("Audi", "A3", 120));
        cars.add(new Car("Honda", "Civic", 90));
        cars.add(new Car("Kia", "Ceed", 110));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Comparator<Car> porownywacz = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };

        Collections.sort(cars, porownywacz);

        System.out.println(cars);

        /*Car c = new Car();
        Car c2 = new Car();
        c.compareTo(c2);*/

        JakisInterfejs klasaAnonimowa = new JakisInterfejs() {
            @Override
            public int a() {
                return 3;
            }

            @Override
            public int b() {
                return 6;
            }

            @Override
            public int c() {
                return 15;
            }
        };

        System.out.println(klasaAnonimowa.a());
        System.out.println(klasaAnonimowa.b());
        System.out.println(klasaAnonimowa.c());

        KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaAbstrakcyjna() {
            @Override
            public void metodaAbstrakcyjna() {
                System.out.println("Abstrakcyjna !!!");
            }
        };

        klasaAbstrakcyjna.x = 5;
        System.out.println(klasaAbstrakcyjna.x);
        klasaAbstrakcyjna.cos();
        klasaAbstrakcyjna.metodaAbstrakcyjna();

        Klasa klasa = new Klasa();
        System.out.println(klasa.a());

        Klasa klasa2 = new Klasa() {
            @Override
            public int a() {
                return 100;
            }
        };

        System.out.println(klasa2.a());

        Klasa klasa3 = new Klasa() {
            public void superMetoda() {
                System.out.println("Super metoda !!");
            }
        };

        klasa3.a();
    }
}
