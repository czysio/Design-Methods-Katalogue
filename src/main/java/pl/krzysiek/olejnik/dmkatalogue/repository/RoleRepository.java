package pl.krzysiek.olejnik.dmkatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krzysiek.olejnik.dmkatalogue.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
