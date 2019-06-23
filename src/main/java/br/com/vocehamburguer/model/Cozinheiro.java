package br.com.vocehamburguer.model;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

public class Cozinheiro extends Funcionario{
	
	public Cozinheiro(final String nome) {
		super(nome);
	}	
	
	public void criaHamburguer(final String nomeHamburguer) {
		throw new NotImplementedException("Metodo nao implementado");
	}
	
	public void adicionaIngredientes(final List<Ingrediente> ingredientes) {
		throw new NotImplementedException("Metodo nao implementado");
	}
}
