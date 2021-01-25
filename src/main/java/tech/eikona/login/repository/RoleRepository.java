package tech.eikona.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.eikona.login.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

   

}
