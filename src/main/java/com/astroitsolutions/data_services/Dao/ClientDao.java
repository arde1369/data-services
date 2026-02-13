package com.astroitsolutions.data_services.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.astroitsolutions.data_services.Entity.Client;
import com.astroitsolutions.data_services.Repository.ClientRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Component
public class ClientDao {

    @Autowired
    private ClientRepository clientRepository;

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Optional<Client> findByFirstnameAndLastname(String firstname, String lastname){
        return clientRepository.findByFirstnameAndLastname(firstname, lastname);
    }

    @CircuitBreaker(name = "databaseCircuitBreaker")
     public void deleteByFirstnameAndLastname(String firstname, String lastname){
        clientRepository.deleteByFirstnameAndLastname(firstname, lastname);
     }

    @CircuitBreaker(name = "databaseCircuitBreaker")
     public Optional<Client> findById(int id) {
        return clientRepository.findById(id);
     }

    @CircuitBreaker(name = "databaseCircuitBreaker")
     public Client save(Client client) {
        return clientRepository.save(client);
     }
}
