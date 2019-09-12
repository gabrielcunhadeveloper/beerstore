package com.gabrielcunha.beerstore.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Beer {

	@EqualsAndHashCode.Include
	private Long id;
	
}
