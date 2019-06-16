package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.vocehamburguer.model.Cozinheiro;

public class CozinheiroTest {

	private Cozinheiro cozinheiro;

	@Test
	public void deveEntenderQueCozinheiroDevePossuirIdENome() {
		// Arrange
		double id = 1;
		String nome = "Thiago";
		
		// Action
		cozinheiro = new Cozinheiro(id, nome);

		// Assert
		assertNotNull(cozinheiro.getId());
		assertNotNull(cozinheiro.getNome());
	}

	public void deveEntenderQueCozinheiroCriaHamburguer() {
		// Arrange

		// Action

		// Assert
	}

	public void deveEntenderQueCozinheiroAdicionaTresIngredientesAoHamburguer() {
		// Arrange

		// Action

		// Assert
	}
}
