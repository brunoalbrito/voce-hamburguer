package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.vocehamburguer.model.Cozinheiro;

public class CozinheiroTest {

	private Cozinheiro cozinheiro;

	private String nomeDoCozinheiro;
	
	@Before
	public void setup() {
		nomeDoCozinheiro = "Thiago";
		cozinheiro = new Cozinheiro(nomeDoCozinheiro);
	}
	
	@Test
	public void deveEntenderQueCozinheiroDevePossuirIdENome() {
		assertNotNull(cozinheiro.getId());
		assertNotNull(cozinheiro.getNome());
		assertEquals(nomeDoCozinheiro,cozinheiro.getNome());
	}

	@Test
	public void deveEntenderQueCozinheiroCriaHamburguer() {
		//Arrange
		String nomeHamburguer = "X-Salada";
		
		// Action
		cozinheiro.criaHamburguer(nomeHamburguer);

		// Assert
		assertNotNull(cozinheiro.getHamburger());
		assertEquals(nomeHamburguer, cozinheiro.getNomeHamburguer());
	}

	public void deveEntenderQueCozinheiroAdicionaTresIngredientesAoHamburguer() {
		// Arrange

		// Action

		// Assert
	}
}
