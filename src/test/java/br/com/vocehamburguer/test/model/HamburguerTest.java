package br.com.vocehamburguer.test.model;

import br.com.vocehamburguer.model.Hamburguer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HamburguerTest {

	private Hamburguer hamburguer;

	private String nomeHamburguer;

	@Before
	public void init() {
		nomeHamburguer = "X-Salada";
		hamburguer = new Hamburguer(nomeHamburguer);
	}

	@Test
	public void deveEntenderCriacaoHamburguerPossuiNome() {
		assertEquals(nomeHamburguer, hamburguer.getNome());
	}

	@Test
	public void deveEntenderCriacaoHamburguerIniciaSemIngredientes() {
		assertEquals(0, hamburguer.getIngredientes().size());
	}

	@Test
	public void deveEntenderCriacaoHamburguerAvaliacaoEFalsa() {
		assertFalse(hamburguer.isAprovado());
	}

}
