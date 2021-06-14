package com.example.h2zoo.repository;

import com.example.h2zoo.model.Mammal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MammalRepository extends CrudRepository<Mammal, Long> {
}
