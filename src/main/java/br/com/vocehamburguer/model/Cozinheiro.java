package br.com.vocehamburguer.model;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

public class Cozinheiro extends Funcionario {
	
	public Cozinheiro(final String nome) {
		super(nome);
	}	
	
	public void criaHamburguer(final String nomeHamburguer) {
		super.hamburger = new Hamburger(nomeHamburguer);
	}
	
	public void adicionaIngredientes(final List<Ingrediente> ingredientes) {
		for (Ingrediente ingrediente : ingredientes) {			
			super.hamburger.adicionaIngrediente(ingrediente);
		}
	}
}
