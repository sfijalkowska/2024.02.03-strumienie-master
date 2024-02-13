package pl.comarch.camp.it.klasy.anonimowe;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private String brand;
    private String model;
    private int price;
}
