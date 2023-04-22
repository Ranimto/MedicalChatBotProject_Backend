package com.example.demo.services.Impl;

import com.example.demo.Model.Admin;
import com.example.demo.Model.Patient;
import com.example.demo.Repository.AdminRepo;
import com.example.demo.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServices {
    private final AdminRepo adminRepo;

    public AdminServices(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    public Admin AddAdmin(Admin admin){

        return adminRepo.save(admin);
    }
    public List<Admin> findAllAdmin(){
        return adminRepo.findAll();
    }

    public Admin updateAdmin(Admin admin){
        return adminRepo.save(admin);
    }

    public Admin findAdminById (Long id){
        return adminRepo.findAdminById(id).orElseThrow(()->new EntityNotFoundException("admin by id"+ id+"was not found")) ;
    }
    public  void  deleteAdmin(Long id){
        adminRepo.deleteAdminById(id); }

}
