package com.example.demo.Repository;

import com.example.demo.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository <Patient,Long> {
    Optional<Patient> findPatientById(Long id);
    //chercher un utlisateurpar son email
    Optional<Patient> findByEmail(String email);

    void deletePatientById(Long id);
}
