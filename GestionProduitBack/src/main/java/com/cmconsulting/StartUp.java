package com.cmconsulting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StartUp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {


        log.info("cette classe StartUp qui implemente l'interface CommandLineRunner nous" +
                " permet de demarrer tout ce qu'on veut au demarrage de l'application");
    }
}
