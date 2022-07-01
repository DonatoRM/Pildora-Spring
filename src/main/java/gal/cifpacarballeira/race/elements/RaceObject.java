package gal.cifpacarballeira.race.elements;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mediante las etiquetas {@code @Configuration} y {@code Bean} indicamos cuales don los Bean's de dependencia
 * que luego serán tenidos en cuenta en la clase {@code RaceController} mediante las etiquetas {@code @Autowired} y
 * {@code @Qualifier}.
 */
@Configuration
public class RaceObject {
    @Bean("getRaceController")
    public RaceController getRaceController() {
        return new RaceController();
    }

    @Bean("getRaceCar")
    public IRaces getRaceCar() {
        return new Car("Peugeot", "205");
    }

    @Bean("getRacingBicycle")
    public IRaces getRacingBicycle() {
        return new Bike("Orbea", "Races");
    }
}
