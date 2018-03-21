package pl.krzysiek.olejnik.dmkatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.krzysiek.olejnik.dmkatalogue.model.DesignMethod;

public interface DesignMethodRepository extends JpaRepository<DesignMethod, Long> {

	@Query(value = "SELECT * FROM design_method ORDER BY created DESC LIMIT 5", nativeQuery = true)
	List<DesignMethod> findFiveNewestMethods();

}
