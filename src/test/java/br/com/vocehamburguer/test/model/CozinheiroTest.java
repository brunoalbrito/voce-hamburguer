package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Ingrediente;

public class CozinheiroTest {

	private Cozinheiro cozinheiro;

	private String nomeDoCozinheiro;

	@Before
	public void setup() {
		nomeDoCozinheiro = "Thiago";
		cozinheiro = new Cozinheiro(nomeDoCozinheiro);
	}

	@Test
	public void deveEntenderQueCozinheiroPossuiIdENome() {
		assertNotNull(cozinheiro.getId());
		assertNotNull(cozinheiro.getNome());
		assertEquals(nomeDoCozinheiro, cozinheiro.getNome());
	}

	@Test
	public void deveEntenderQueCozinheiroCriaHamburguer() {
		// Arrange
		String nomeHamburguer = "X-Salada";

		// Action
		cozinheiro.criaHamburguer(nomeHamburguer);

		// Assert
		assertNotNull(cozinheiro.getHamburguer());
		assertEquals(nomeHamburguer, cozinheiro.getNomeHamburguer());
	}

	@Ignore
	@Test
	public void deveEntenderQueCozinheiroAdicionaTresIngredientesAoHamburguer() {
		// Arrange
		Ingrediente ingrediente1 = Ingrediente.builder().nome("Hamburguer de Picanha")
				.tipoIngrediente(TipoIngrediente.HAMBURGUER).build();
		List<Ingrediente> ingredientes = Arrays.asList(ingrediente1);

		// Action
		cozinheiro.adicionaIngredientes(ingredientes);

		// Assert
		assertEquals(3, cozinheiro.getHamburguer().getIngredientes().size());
	}
}
