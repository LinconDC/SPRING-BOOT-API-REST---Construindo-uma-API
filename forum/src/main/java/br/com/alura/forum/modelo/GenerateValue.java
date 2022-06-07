package br.com.alura.forum.modelo;

import javax.persistence.GenerationType;

public @interface GenerateValue {

	GenerationType strategy();

}
