package br.com.vocehamburguer.model;

import lombok.Getter;

@Getter
public class Avaliacao {

	private boolean resultadoAvaliacao;

	private Hamburguer hamburguer;

	public Avaliacao(Hamburguer hamburguer) {
		this.resultadoAvaliacao = hamburguer.isAprovado();
		this.hamburguer = hamburguer;
	}

	public void avaliaHamburguer() {

	}

}
