package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

public class Inspetor extends Funcionario {

	public Inspetor(String nome) {
		super(nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		throw new NotImplementedException("Metodo nao implementado");
	}

	public Hamburger avalia() {
		throw new NotImplementedException("Metodo nao implementado");
	}
	
	public boolean statusHamburgerPosAvaliacao() {
		throw new NotImplementedException("Metodo nao implementado");
	}

	public int qtdIngredientesHamburguerAvaliado() {
		throw new NotImplementedException("Metodo nao implementado");
	}
}
