package br.com.vocehamburguer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Funcionario {
	
	@Getter
	private double id;
	
	@Getter
	private String nome;
}
