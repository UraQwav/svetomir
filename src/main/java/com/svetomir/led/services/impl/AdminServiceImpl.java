package com.svetomir.led.services.impl;

import com.svetomir.led.entity.Admin;
import com.svetomir.led.repository.AdminRepository;
import com.svetomir.led.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
@Component
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin GetAdminByLoginAndPassword(Admin admin){
        return adminRepository.findByLoginAndPassword(admin.getLogin(), admin.getPassword());
    }
}
