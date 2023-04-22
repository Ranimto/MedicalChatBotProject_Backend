package com.example.demo.Repository;

import com.example.demo.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin,Long> {

    Optional<Admin> findAdminById(Long id);
    void deleteAdminById(Long id);
}
