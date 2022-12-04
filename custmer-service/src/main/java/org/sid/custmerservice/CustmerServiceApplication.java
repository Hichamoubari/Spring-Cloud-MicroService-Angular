package org.sid.custmerservice;

import org.sid.custmerservice.Repositories.CustomerRepository;
import org.sid.custmerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustmerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustmerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
          customerRepository.save(new Customer(null,"Hicham","hicham@gmail.com"));
          customerRepository.save(new Customer(null,"Ghita","ghita@gmail.com"));
          customerRepository.save(new Customer(null,"Zahra","zahra@gmail.com"));
          customerRepository.findAll().forEach(c->{
              System.out.println(c);
          });
        };
    }

}
