package com.squadtop.storedelivery.repository;

import com.squadtop.storedelivery.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
