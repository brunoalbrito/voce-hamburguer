package br.com.vocehamburguer.model;

public class Inspetor extends Funcionario {

	public Inspetor(String nome) {
		super(nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		super.hamburguer = cozinheiro.hamburguer;
	}

	public boolean analisa() {
		Avaliacao avaliacao = new Avaliacao(hamburguer);
		return avaliacao.executaAvaliacao();
	}

}
