package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.vocehamburguer.model.Cozinheiro;

public class CozinheiroTest {

	private Cozinheiro cozinheiro;

	@Test
	public void deveEntenderQueCozinheiroDevePossuirIdENome() {
		// Arrange
		
		// Action
		cozinheiro = new Cozinheiro("Thiago");

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
