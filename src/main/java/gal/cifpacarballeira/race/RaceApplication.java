package gal.cifpacarballeira.race;

import gal.cifpacarballeira.race.elements.RaceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * En esta clase ejecutamos la Aplicación de Spring
 * Lo primero que deberemos hacer será crear un archivo comprimido desde la página {@code https://start.spring.io/}
 * para que cree las carpetas necesarias para nuestro proyecto, y además genere él solo las dependencias necesarias.
 */
@SpringBootApplication
public class RaceApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext objectCreation = SpringApplication.run(RaceApplication.class, args);
        RaceController race = objectCreation.getBean(RaceController.class);
        race.raceBegins();

    }

}
