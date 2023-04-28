package com.example.doce.doceria.repository;

import com.example.doce.doceria.entity.Doce;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoceRepository extends JpaRepository<Doce, Long> {

}
