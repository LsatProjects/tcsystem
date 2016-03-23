package br.com.lsat.tc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lsat.tc.entity.Athlet;
import org.springframework.stereotype.Repository;

@Repository
public interface AthletRepository extends JpaRepository<Athlet, Long> {

}
