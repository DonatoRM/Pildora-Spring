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
 * Se genera la clase {@code Bike} implementada con la interface {@code IRaces} para inversión de dependencias
 */
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Bike implements IRaces {

    private String brand;
    private String type;
    private static final String TEXT="The bicycle rides on the road";

    private String pedal() {
        return TEXT;
    }

    /**
     * Se implementa el método {@code StartOfTheRace} de la interface {@code IRace}.
     */
    @Override
    public void startOfTheRace() {
        System.out.println(this.pedal());
    }
}
