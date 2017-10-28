package nick.test;


import com.sun.glass.ui.Application;
import nick.test.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringTestApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApp.class, args);
    }

}
