package com.astroitsolutions.data_services.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astroitsolutions.data_services.Entity.Client;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

     public Optional<Client> findByFirstnameAndLastname(String firstname, String lastname);

     public void deleteByFirstnameAndLastname(String firstname, String lastname);
}
