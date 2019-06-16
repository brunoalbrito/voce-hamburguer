package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Hamburger;
import br.com.vocehamburguer.model.Ingrediente;
import br.com.vocehamburguer.model.Inspetor;

public class InspetorTest {

	private Inspetor inspetor;
	private Cozinheiro cozinheiro;
	private ArrayList<Ingrediente> ingredientes;

	@Before
	private void setup() {
		cozinheiro = new Cozinheiro("Bruno");
		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(new Ingrediente("Hamburguer de Picanha", TipoIngrediente.HAMBURGUER));
		ingredientes.add(new Ingrediente("Alface", TipoIngrediente.SALADA));
	}

	@Test
	public void deveEntenderAvaliaDeHamburguerComTresIngredientesDiferentes() {
		// Arrange
		cozinheiro.criaHamburguer("XBacon");
		cozinheiro.adicionaIngredientes(ingredientes);
		
		inspetor.recebeHamburguer(cozinheiro);
		
		// Action
		Hamburger hamburger = inspetor.avalia(); 
		// Assert
		assertTrue(hamburger.isPosAvaliacao());
		assertEquals(3, inspetor.qtdIngredientesHamburguerAvaliado());
	}

	public void deveEntenderAvaliaDeHamburguerComTresIngredienteIguais() {
		// Arrange

		// Action
		inspetor.avalia();
		
		// Assert
		assertFalse(inspetor.statusHamburgerPosAvaliacao());
	}

	public void deveEntenderAvaliaDeHamburguerComApenasUmIngrediente() {
		// Arrange

		// Action
		inspetor.avalia();

		// Assert
		assertFalse(inspetor.statusHamburgerPosAvaliacao());
	}

	public void deveEntenderAvaliaDeHambuguerComQuatroIngredientes() {
		// Arrange

		// Action
		inspetor.avalia();

		// Assert
		assertFalse(inspetor.statusHamburgerPosAvaliacao());
	}
}
