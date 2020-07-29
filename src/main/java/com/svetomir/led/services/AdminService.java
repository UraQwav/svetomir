package com.svetomir.led.services;

import com.svetomir.led.entity.Admin;

public interface AdminService {
    Admin GetAdminByLoginAndPassword(Admin admin);
}
