package com.fonyou.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fonyou.demo.models.PreguntaModel;

@Repository
public interface PreguntaRepository extends CrudRepository<PreguntaModel, Long> {
    
}
