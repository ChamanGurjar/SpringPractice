package com.gurjar.chaman.cgrecipeproject.repositories;

import com.gurjar.chaman.cgrecipeproject.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
