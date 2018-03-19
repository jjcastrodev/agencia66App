package web.afip.dgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class Agencia66AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Agencia66AppApplication.class, args);
	}
        
        @RequestMapping("/puto")
        public String hola() {
            return "Hola Puto";
        }
}
