package gal.cifpacarballeira.race.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Con {@code @Autowired} inyectamos cada una de las dependencias de los Bean's indicados con las etiquetas {@code @Qualifier}
 */
public class RaceController {
    @Autowired
    @Qualifier("getRaceCar")
    IRaces raceCar;
    @Autowired
    @Qualifier("getRacingBicycle")
    IRaces racingBicycle;

    public void raceBegins() {

        //Tanto para un objeto como para el otro usamos la inversión de dependencias
        raceCar.startOfTheRace();
        racingBicycle.startOfTheRace();
    }
}
