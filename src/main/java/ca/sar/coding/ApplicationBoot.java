package ca.sar.coding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"ca.sar.*"})
@EnableJpaRepositories(basePackages = "ca.sar.coding.repo")
@EntityScan(basePackages = {"ca.sar.coding.model"})
public class ApplicationBoot  {

    private static final Logger log = LoggerFactory.getLogger(ApplicationBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }


}