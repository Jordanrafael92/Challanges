package com.jordansilva.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordansilva.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
