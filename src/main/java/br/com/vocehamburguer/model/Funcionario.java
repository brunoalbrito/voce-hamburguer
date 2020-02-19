package br.com.vocehamburguer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Funcionario {

	private String id;

	private String nome;

	protected Hamburguer hamburguer;
	
	public Funcionario(final String nome) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
	}
}
