package za.co.entelect.tourzimcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.entelect.tourzimcore.model.Resort;

import java.util.Optional;

public interface ResortRepository extends JpaRepository<Resort,Long> {

    Optional<Resort> findByName(String name);
}
