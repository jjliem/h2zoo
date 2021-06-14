package com.example.h2zoo.repository;

import com.example.h2zoo.model.Fish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepository extends CrudRepository<Fish, Long> {

}
