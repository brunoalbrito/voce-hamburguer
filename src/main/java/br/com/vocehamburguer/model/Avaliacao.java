package br.com.vocehamburguer.model;

import lombok.Data;

@Data
public class Avaliacao {

	private boolean nota;
	
	private Hamburger hamburger;

	public Avaliacao(Hamburger hamburger) {
		this.nota = hamburger.isPosAvaliacao();
		this.hamburger = hamburger;
	}
}
