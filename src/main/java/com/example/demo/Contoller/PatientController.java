package com.example.demo.Contoller;

import com.example.demo.Model.Patient;
import com.example.demo.services.Impl.PatientServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    private final PatientServices patientService ;
    public PatientController(PatientServices patientService) {
        this.patientService = patientService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatient(){
        List<Patient> Patients= patientService.findAllPatient();
        return new ResponseEntity<>(Patients, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getEmployeeById(@PathVariable("id") Long id){
        Patient patient= patientService.findPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
     Patient newPatient=patientService.addPatient(patient);
      return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Patient> UpdatePatient(@RequestBody Patient patient){
        Patient updatePatient=patientService.UpdatePatient(patient);
        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeletePatient(@PathVariable("id") Long id) {
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
