package br.com.vocehamburguer.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Funcionario {
	
	@Getter
	private String id;
	
	@Getter
	private String nome;
	
	@Getter
	protected Hamburguer hamburguer;
	
	public Funcionario(final String nome) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
	}
}
