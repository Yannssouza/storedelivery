package com.squadtop.storedelivery.repository;

import com.squadtop.storedelivery.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
