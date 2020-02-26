package br.com.vocehamburguer.test.model;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Ingrediente;
import br.com.vocehamburguer.model.Inspetor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InspetorTest {

	private Inspetor inspetor;

	private Cozinheiro cozinheiro;

	private List<Ingrediente> ingredientes;

	@Before
	public void setup() {
		cozinheiro = new Cozinheiro("Bruno");
		inspetor = new Inspetor("Bugiganga");
		ingredientes = new ArrayList<>();
	}

	@Test
	public void deveEntenderAvaliacaoDeHamburguerComTresIngredientesDiferentes() {
		// Arrange
		itensDiferentes();
		preparaHamburguer();

		// Action
		boolean resultado = inspetor.analisa();

		// Assert
		assertTrue(resultado);
	}

	@Test
	public void deveEntenderAvaliaDeHamburguerComTresIngredienteIguais() {
		// Arrange
		itensIguais();
		preparaHamburguer();

		// Action
		boolean resultado = inspetor.analisa();

		// Assert
		assertFalse(resultado);
	}

	@Test
	public void deveEntenderAvaliaDeHamburguerComApenasUmIngrediente() {
		// Arrange
		ingredientes.add(criaIngrediente("Pao de Forma", TipoIngrediente.PAO));
		preparaHamburguer();

		// Action
		boolean resultado = inspetor.analisa();

		// Assert
		assertFalse(resultado);
	}

	@Test
	public void deveEntenderAvaliaDeHambuguerComQuatroIngredientes() {
		// Arrange
		itensDiferentes();
		Ingrediente ingrediente = criaIngrediente("Pao de Forma", TipoIngrediente.PAO);
		ingredientes.add(ingrediente);
		preparaHamburguer();

		// Action
		boolean resultado = inspetor.analisa();

		// Assert
		assertFalse(resultado);
	}

	private void preparaHamburguer() {
		cozinheiro.criaHamburguer("XBacon");
		cozinheiro.adicionaIngredientes(ingredientes);
		inspetor.recebeHamburguer(cozinheiro);
	}

	private void itensDiferentes() {
		ingredientes.add(criaIngrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(criaIngrediente("Hamburguer de Picanha", TipoIngrediente.HAMBURGUER));
		ingredientes.add(criaIngrediente("Alface", TipoIngrediente.SALADA));
	}

	private void itensIguais() {
		ingredientes.add(criaIngrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(criaIngrediente("Pao de Batata", TipoIngrediente.PAO));
		ingredientes.add(criaIngrediente("Pao de Batata", TipoIngrediente.PAO));
	}

	private Ingrediente criaIngrediente(String nome, TipoIngrediente tipoIngrediente) {
		return new Ingrediente(nome, tipoIngrediente);
	}

}
