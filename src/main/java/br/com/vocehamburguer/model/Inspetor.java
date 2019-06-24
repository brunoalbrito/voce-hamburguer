package br.com.vocehamburguer.model;

public class Inspetor extends Funcionario {

	public Inspetor(String nome) {
		super(nome);
	}

	public void recebeHamburguer(final Cozinheiro cozinheiro) {
		super.hamburger = cozinheiro.hamburger;
	}

	public Avaliacao avalia() {
		for (int i = 1; i < hamburger.getIngredientes().size(); i++) {
			if(hamburger.getIngredientes().get(i -1).getTipoIngrediente().equals(hamburger.getIngredientes().get(1).getTipoIngrediente())) {
				hamburger.recebeAvaliacao(false);
				break;
			}
		}
		hamburger.recebeAvaliacao(true);
		return new Avaliacao(hamburger) ;
	}
	
	public boolean statusHamburgerPosAvaliacao() {
		return false;
	}

	public int qtdIngredientesHamburguerAvaliado() {
		return 0;
	}
}
