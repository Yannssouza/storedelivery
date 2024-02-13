package com.squadtop.storedelivery.repository;

import com.squadtop.storedelivery.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByName(String name);
}
