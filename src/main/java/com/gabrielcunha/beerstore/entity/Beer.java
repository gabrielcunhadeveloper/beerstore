package com.gabrielcunha.beerstore.entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Beer {

	@EqualsAndHashCode.Include
	@Id
	@SequenceGenerator(name = "beer_seq", sequenceName = "beer_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beer_seq")
	private Long id;
	
	private String name;
	
	private BeerType type;
	
	private BigDecimal volume;
	
}
