package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.com.vocehamburguer.model.Hamburguer;

public class HamburguerTest {
	
	private Hamburguer hamburguer;
	
	@Test
	public void deveEntenderCriacaoHamburguerIniciaSemIngredientesEPossuiNomeESemAvaliacao() {
		//Arrange
		String nomeHamburguer = "XRatao";
	
		//Action
		hamburguer = new Hamburguer(nomeHamburguer);
		
		//Assert
		assertNotNull(hamburguer.getNome());
		assertFalse(hamburguer.getNome().isEmpty());
		assertEquals(0, hamburguer.getIngredientes().size());
		assertNull(hamburguer.isAprovado());
	}
}
