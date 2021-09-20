package com.example.leilao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leilao.entities.Comprador;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador, Integer>{

}
