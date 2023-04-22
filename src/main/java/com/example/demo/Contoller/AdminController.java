package com.example.demo.Contoller;

import com.example.demo.Model.Admin;
import com.example.demo.Model.Patient;
import com.example.demo.services.Impl.AdminServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {
    private final  AdminServices adminService ;

    public AdminController(AdminServices adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmin() {
        List<Admin> Admins = adminService.findAllAdmin();
        return new ResponseEntity<>(Admins, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id){
        Admin admin= adminService.findAdminById(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> UpdateAdmin(@RequestBody Admin admin){
        Admin updatePatient=adminService.updateAdmin(admin);
        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteAdmin(@PathVariable("id") Long id) {
        adminService.deleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    }
