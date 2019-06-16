package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

import lombok.Getter;

public class Cozinheiro extends Funcionario{

	@Getter
	private Hamburger hamburger;
	
	public Cozinheiro(double id, String nome) {
		super(id, nome);
	}
	
	
	public void criaHamburguer(final String nomeHamburguer) {
		throw new NotImplementedException("Método não implementado");
	}
	
	public void preparaHamburguer(final Ingrediente ingrediente) {
		throw new NotImplementedException("Método não implementado");
	}
	
}
