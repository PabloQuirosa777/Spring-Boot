package logging;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@CommonsLog // te muestra los errores que puede tener el codigo
public class MainController {
    @Bean
    public String index() {

        log.trace("Mensaje a nivel de TRACE");
        log.debug("Mensaje a nivel de DEBUG");
        log.info("Mensaje a nivel de INFO");
        log.warn("Mensaje a nivel de WARNING");
        log.error("Mensaje a nivel de ERROR");

        return "Hola! Mira los logs para ver los resultados";
    }
}
