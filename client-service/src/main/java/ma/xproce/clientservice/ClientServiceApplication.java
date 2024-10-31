package ma.xproce.clientservice;

import ma.xproce.clientservice.entities.Client;
import ma.xproce.clientservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(ClientRepository clientRepository){
        return args ->{
            clientRepository.save(new Client(Long.parseLong("1"), "Rabab"," SELIMANI",  Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"),  "Amal","  RAMI", Float.parseFloat("22")));
            clientRepository.save(new  Client(Long.parseLong("3"),  "Samir","  SAFI", Float.parseFloat("22")));

        };
    }

}
