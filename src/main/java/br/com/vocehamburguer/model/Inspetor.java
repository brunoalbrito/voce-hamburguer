package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

import br.com.vocehamburguer.enums.StatusPosAvaliacao;
import lombok.Getter;

public class Inspetor extends Funcionario {

	@Getter
	private Hamburger hamburguer;

	public Inspetor(double id, String nome) {
		super(id, nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		throw new NotImplementedException("Método não implementado");
	}

	public StatusPosAvaliacao statusUltimoHamburguerAvaliado() {
		throw new NotImplementedException("Método não implementado");
	}

	public void avalia() {
		throw new NotImplementedException("Método não implementado");
	}
	
	public StatusPosAvaliacao statusHamburgerPosAvaliacao() {
		throw new NotImplementedException("Método não implementado");
	}

}
