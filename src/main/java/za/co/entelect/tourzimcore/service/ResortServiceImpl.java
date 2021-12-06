package za.co.entelect.tourzimcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.entelect.tourzimcore.model.Resort;
import za.co.entelect.tourzimcore.repository.ResortRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ResortServiceImpl  implements ResortService{
    @Autowired
    private ResortRepository resortRepository;


    @Override
    public Optional<Resort> findById(Long id) {
        return resortRepository.findById(id);
    }

    @Override
    public Optional<Resort> findByName(String name) {
        return resortRepository.findByName(name);
    }

    @Override
    public List<Resort> findAll() {
        return resortRepository.findAll();
    }

    @Override
    public Optional<Resort> save(Resort resort) {
        return Optional.ofNullable(resortRepository.save(resort));
    }
}
