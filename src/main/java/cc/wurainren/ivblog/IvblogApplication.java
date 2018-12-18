package cc.wurainren.ivblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
@SpringBootApplication
public class IvblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(IvblogApplication.class, args);
    }

}

