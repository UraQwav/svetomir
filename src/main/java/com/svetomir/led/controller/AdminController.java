package com.svetomir.led.controller;

import com.svetomir.led.entity.Admin;
import com.svetomir.led.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @PostMapping("/sign-in")
    public Admin getAdmin(@RequestBody Admin admin){
        Admin as = adminService.GetAdminByLoginAndPassword(admin);
        return adminService.GetAdminByLoginAndPassword(admin);
    }

}
