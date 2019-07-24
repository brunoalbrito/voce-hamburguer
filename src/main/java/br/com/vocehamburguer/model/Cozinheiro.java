package br.com.vocehamburguer.model;

import java.util.List;

public class Cozinheiro extends Funcionario {
	
	public Cozinheiro(final String nome) {
		super(nome);
	}	
	
	public void criaHamburguer(final String nomeHamburguer) {
		super.hamburguer = new Hamburguer(nomeHamburguer);
	}
	
	public void adicionaIngredientes(final List<Ingrediente> ingredientes) {
		for (Ingrediente ingrediente : ingredientes) {			
			super.hamburguer.adicionaIngrediente(ingrediente);
		}
	}

	public String getNomeHamburguer() {
		return super.hamburguer.getNome();
	}
}
