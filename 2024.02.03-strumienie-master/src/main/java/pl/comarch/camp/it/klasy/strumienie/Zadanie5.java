package pl.comarch.camp.it.klasy.strumienie;

import java.util.List;

/*
Stwórz klasę Employee.
Każdy pracownik ma posiadać id, imie, nazwisko, płacę i stanowisko (LOW, MID, HIGH).
Stwórz listę pracowników - 10 sztuk.
Napisz strumień który wypisuje ID każdego pracownika średniego szczebla zarabiającego
między 4000 - 5000 zmieniając przy okazji jego płacę na 4800 zł.
Program ma na końcu iterować pętlą po wszystkich użytkownikach i wypisywać ich na ekranie.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        List<Employee> pracownicy = List.of(
                new Employee(1, "Janusz", "Kowalski", 3000, Employee.Position.LOW),
                new Employee(2, "Imie 1", "Nazwisko 1", 3300, Employee.Position.LOW),
                new Employee(3, "Imie 2", "Nazwisko 2", 3600, Employee.Position.MID),
                new Employee(4, "Imie 3", "Nazwisko 3", 3900, Employee.Position.LOW),
                new Employee(5, "Imie 4", "Nazwisko 4", 4200, Employee.Position.MID),
                new Employee(6, "Imie 5", "Nazwisko 5", 4500, Employee.Position.MID),
                new Employee(7, "Imie 6", "Nazwisko 6", 4800, Employee.Position.HIGH),
                new Employee(8, "Imie 7", "Nazwisko 7", 5100, Employee.Position.MID),
                new Employee(9, "Imie 8", "Nazwisko 8", 5000, Employee.Position.HIGH),
                new Employee(10, "Imie 9", "Nazwisko 9", 5400, Employee.Position.HIGH)
        );

        pracownicy.stream()
                .filter(e -> e.getPosition() == Employee.Position.MID)
                .filter(e -> e.getSalary() > 4000)
                .filter(e -> e.getSalary() < 5000)
                .peek(e -> e.setSalary(4800))
                .map(Employee::getId)
                .forEach(System.out::println);

        System.out.println(pracownicy);
    }
}
