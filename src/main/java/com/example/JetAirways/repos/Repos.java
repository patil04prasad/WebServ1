package com.example.JetAirways.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.JetAirways.model.JetAirways;

@Repository
public interface Repos extends CrudRepository<JetAirways, Integer>
{

}
