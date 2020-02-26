package br.com.vocehamburguer.model;

import lombok.Getter;

public class Avaliacao {

	@Getter
	private boolean resultadoAvaliacao;

	private Hamburguer hamburguer;

	public Avaliacao(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}

	public boolean avaliaHamburguer() {
		this.resultadoAvaliacao = true;
		if (hamburguer.getIngredientes().size() != 3) {
			this.resultadoAvaliacao = false;
			return false;
		}
		for (int i = 0; i < hamburguer.getIngredientes().size() - 1; i++) {
			if (hamburguer.getIngredientes().get(i).getTipoIngrediente()
					.compareTo(hamburguer.getIngredientes().get(i + 1).getTipoIngrediente()) == 0) {
				resultadoAvaliacao = false;
				break;
			}
		}
		hamburguer.recebeAvaliacao(this);
		return resultadoAvaliacao;
	}

}
