package br.com.vocehamburguer.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Hamburguer {

	private String nome;

	private List<Ingrediente> ingredientes;

	private boolean aprovado;

	public Hamburguer(final String nome) {
		this.ingredientes = new ArrayList<Ingrediente>();
		this.nome = nome;
	}

	public void adicionaIngrediente(final Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);

	}

}