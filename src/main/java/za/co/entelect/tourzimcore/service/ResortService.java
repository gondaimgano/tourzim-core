package za.co.entelect.tourzimcore.service;

import za.co.entelect.tourzimcore.model.Resort;

import java.util.List;
import java.util.Optional;

public interface ResortService {
    Optional<Resort> findById(Long id);

    Optional<Resort> findByName(String name);

    List<Resort> findAll();

    Optional<Resort> save(Resort resort);


}
