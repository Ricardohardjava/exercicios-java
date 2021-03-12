package br.com.ricardo.albuquerque.springteste.repository;

import br.com.ricardo.albuquerque.springteste.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
