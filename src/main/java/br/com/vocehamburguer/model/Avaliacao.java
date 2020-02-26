package br.com.vocehamburguer.model;

public class Avaliacao {

	private Hamburguer hamburguer;

	public Avaliacao(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}

	public boolean executaAvaliacao() {
		boolean resultadoAvaliacao = true;

		if (!isTresIngredientes()) {
			resultadoAvaliacao = false;
		}
		else {
			resultadoAvaliacao = analisaIngredientesHamburguer();
		}
		return resultadoAvaliacao;
	}

	private boolean isTresIngredientes() {
		return hamburguer.getIngredientes().size() == 3;
	}

	private boolean analisaIngredientesHamburguer() {
		for (int i = 0; i < hamburguer.getIngredientes().size() - 1; i++) {
			if (hamburguer.getIngredientes().get(i).getTipoIngrediente()
					.compareTo(hamburguer.getIngredientes().get(i + 1).getTipoIngrediente()) == 0) {
				return false;
			}
		}
		return true;
	}

}
