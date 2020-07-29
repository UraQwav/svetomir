package com.svetomir.led.repository;

import com.svetomir.led.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByLoginAndPassword(String login, String password);
}
