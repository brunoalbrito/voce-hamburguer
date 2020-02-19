package br.com.vocehamburguer.model;

public class Inspetor extends Funcionario {

	public Inspetor(String nome) {
		super(nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		super.hamburguer = cozinheiro.hamburguer;
	}

	public Avaliacao avalia() {
		return new Avaliacao(hamburguer);
	}

	public boolean statusHamburguerPosAvaliacao() {
		return hamburguer.isAprovado();
	}

	public int qtdIngredientesHamburguerAvaliado() {
		return hamburguer.getIngredientes().size();
	}

}
