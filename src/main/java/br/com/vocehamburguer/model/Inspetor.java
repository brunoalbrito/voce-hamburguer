package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

public class Inspetor extends Funcionario {

	public Inspetor(String nome) {
		super(nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		throw new NotImplementedException("Método não implementado");
	}

	public Hamburger avalia() {
		throw new NotImplementedException("Método não implementado");
	}
	
	public boolean statusHamburgerPosAvaliacao() {
		throw new NotImplementedException("Método não implementado");
	}

	public int qtdIngredientesHamburguerAvaliado() {
		throw new NotImplementedException("Método não implementado");
	}
}
