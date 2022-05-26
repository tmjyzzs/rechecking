package translate.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import translate.demo.service.Exchange;

@SpringBootApplication
@EnableSwagger2
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

}
