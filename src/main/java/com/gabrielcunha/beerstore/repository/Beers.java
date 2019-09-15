package com.gabrielcunha.beerstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielcunha.beerstore.entity.Beer;

public interface Beers extends JpaRepository<Beer, Long>{

}
