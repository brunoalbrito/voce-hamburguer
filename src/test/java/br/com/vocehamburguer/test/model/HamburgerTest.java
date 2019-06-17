package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.com.vocehamburguer.model.Hamburger;

public class HamburgerTest {
	
	private Hamburger hamburger;
	
	@Test
	public void deveEntenderCriacaoHamburguerIniciaSemIngredientesEPossuiNomeESemAvaliacao() {
		//Arrange
		String nomeHamburguer = "XRatao";
	
		//Action
		hamburger = new Hamburger(nomeHamburguer);
		
		//Assert
		assertNotNull(hamburger.getNome());
		assertFalse(hamburger.getNome().isEmpty());
		assertEquals(0, hamburger.getIngredientes().size());
		assertNull(hamburger.isPosAvaliacao());
	}
}
