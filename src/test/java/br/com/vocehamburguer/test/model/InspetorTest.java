package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.vocehamburguer.enums.StatusPosAvaliacao;
import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Inspetor;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Ingrediente;

public class InspetorTest {

	private Inspetor inspetor;
	private Cozinheiro cozinheiro;

	@Before
	private void setup() {
		cozinheiro = new Cozinheiro(0, "Bruno");
	}

	@Test
	public void deveEntenderAvaliaDeHamburguerComTresIngredientesDiferentes() {
		// Arrange
		cozinheiro.criaHamburguer("XBacon");
		cozinheiro.preparaHamburguer(new Ingrediente("Pao de Batata", TipoIngrediente.PAO));
		cozinheiro.preparaHamburguer(new Ingrediente("Hamburguer de Picanha", TipoIngrediente.HAMBURGUER));
		cozinheiro.preparaHamburguer(new Ingrediente("Alface", TipoIngrediente.SALADA));
		inspetor.recebeHamburguer(cozinheiro);

		// Action
		inspetor.avalia();
		StatusPosAvaliacao obtido = inspetor.statusHamburgerPosAvaliacao();

		// Assert
		StatusPosAvaliacao esperado = StatusPosAvaliacao.APROVADO;
		assertEquals(esperado, obtido);
	}

	public void deveEntenderAvaliaDeHamburguerComTresIngredienteIguais() {
		// Arrange

		// Action
		inspetor.avalia();
		StatusPosAvaliacao obtido = inspetor.statusHamburgerPosAvaliacao();

		// Assert
		StatusPosAvaliacao esperado = StatusPosAvaliacao.REPROVADO;
		assertEquals(esperado, obtido);
	}

	public void deveEntenderAvaliaDeHamburguerComApenasUmIngrediente() {
		// Arrange

		// Action
		inspetor.avalia();
		StatusPosAvaliacao obtido = inspetor.statusHamburgerPosAvaliacao();

		// Assert
		StatusPosAvaliacao esperado = StatusPosAvaliacao.REPROVADO;
		assertEquals(esperado, obtido);
	}

	public void deveEntenderAvaliaDeHambuguerComQuatroIngredientes() {
		// Arrange

		// Action
		inspetor.avalia();
		StatusPosAvaliacao obtido = inspetor.statusHamburgerPosAvaliacao();

		// Assert
		StatusPosAvaliacao esperado = StatusPosAvaliacao.REPROVADO;
		assertEquals(esperado, obtido);
	}
}
