package com.example.demo.Repositories;

import com.example.demo.Beans.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole(String username);
}
