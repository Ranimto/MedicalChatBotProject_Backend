package com.example.demo.services.Impl;

import com.example.demo.Model.Patient;
import com.example.demo.Repository.PatientRepo;
import com.example.demo.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class PatientServices {
    private final PatientRepo patientRepo ;

    @Autowired
    public PatientServices(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient addPatient(Patient patient){
        //patient.setId(UUID.randomUUID().toString());
        return patientRepo.save(patient) ;
    }
    public List<Patient> findAllPatient(){
        return patientRepo.findAll();
    }

    public Patient UpdatePatient(Patient patient){
        return patientRepo.save(patient);
    }

    public Patient findPatientById (Long id){

        return patientRepo.findPatientById(id).orElseThrow(()->new EntityNotFoundException("user by id"+ id+"was not found")) ;
    }
    public  void  deletePatient(Long id){
        patientRepo.deletePatientById(id); }
}
