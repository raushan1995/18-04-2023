package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.javaninja.ajeet.covid4j.CovidStats;

public interface repo  extends MongoRepository<CovidStats, Integer>{

}
