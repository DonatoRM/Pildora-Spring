package gal.cifpacarballeira.race.elements;
/*
 Como podemos observar utilizamos la librería de Lombok para que nos genere automáticamente el constructor, los
 getters, los setters y la sobrecarga del método toString.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Se genera la clase Car implementada con la interface {@code IRaces} para inversión de dependencias
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car implements IRaces {
    private String brand;
    private String model;
    private static final String TEXT="The car is driving on the road";

    private String circulate() {
        return TEXT;
    }

    /**
     * Se implementa el método {@code StartOfTheRace} de la interface {@code IRace}.
     */
    @Override
    public void startOfTheRace() {
        System.out.println(this.circulate());
    }
}
