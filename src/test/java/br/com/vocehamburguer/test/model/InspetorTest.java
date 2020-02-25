package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Avaliacao;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Ingrediente;
import br.com.vocehamburguer.model.Inspetor;

public class InspetorTest {

	private Inspetor inspetor;

	private Cozinheiro cozinheiro;

	private List<Ingrediente> ingredientes;

	@Before
	public void setup() {
		cozinheiro = new Cozinheiro("Bruno");
		inspetor = new Inspetor("Bugiganga");
		ingredientes = new ArrayList<Ingrediente>();
	}

	@Test
	public void deveEntenderAvaliacaoDeHamburguerComTresIngredientesDiferentes() {
		// Arrange
		itensDiferentes();
		preparaHamburguer();

		// Action
		Avaliacao avaliacao = inspetor.avalia();

		// Assert
		assertTrue(avaliacao.isResultadoAvaliacao());
		assertEquals(3, inspetor.qtdIngredientesHamburguerAvaliado());
	}


	@Test
	public void deveEntenderAvaliaDeHamburguerComTresIngredienteIguais() {
		// Arrange
		itensIguais();
		preparaHamburguer();

		// Action
		Avaliacao avaliacao = inspetor.avalia();

		// Assert
		assertFalse(inspetor.statusHamburguerPosAvaliacao());
	}

	public void deveEntenderAvaliaDeHamburguerComApenasUmIngrediente() {
		// Arrange

		// Action
		inspetor.avalia();

		// Assert
		assertFalse(inspetor.statusHamburguerPosAvaliacao());
	}

	public void deveEntenderAvaliaDeHambuguerComQuatroIngredientes() {
		// Arrange

		// Action
		inspetor.avalia();

		// Assert
		assertFalse(inspetor.statusHamburguerPosAvaliacao());
	}

	private void preparaHamburguer() {
		cozinheiro.criaHamburguer("XBacon");
		cozinheiro.adicionaIngredientes(ingredientes);
		inspetor.recebeHamburguer(cozinheiro);
	}

	private void itensDiferentes() {
		ingredientes.add(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(new Ingrediente("Hamburguer de Picanha", TipoIngrediente.HAMBURGUER));
		ingredientes.add(new Ingrediente("Alface", TipoIngrediente.SALADA));
	}

	private void itensIguais() {
		ingredientes.add(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
	}

}
