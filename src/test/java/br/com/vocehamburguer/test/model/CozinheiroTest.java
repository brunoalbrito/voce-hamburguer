package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Cozinheiro;
import br.com.vocehamburguer.model.Ingrediente;
import br.com.vocehamburguer.model.Ingrediente.IngredienteBuilder;

public class CozinheiroTest {

	private Cozinheiro cozinheiro;

	private String nomeDoCozinheiro;

	private String nomeHamburguer = "X-Salada";

	@Before
	public void setup() {
		nomeDoCozinheiro = "Thiago";
		cozinheiro = new Cozinheiro(nomeDoCozinheiro);
		criaHamburguer();
	}

	@Test
	public void deveEntenderQueCozinheiroPossuiIdENome() {
		assertNotNull(cozinheiro.getId());
		assertNotNull(cozinheiro.getNome());
		assertEquals(nomeDoCozinheiro, cozinheiro.getNome());
	}

	@Test
	public void deveEntenderQueCozinheiroCriaHamburguer() {
		// Assert
		assertNotNull(cozinheiro.getHamburguer());
		assertEquals(nomeHamburguer, cozinheiro.getNomeHamburguer());
	}

	private void criaHamburguer() {
		cozinheiro.criaHamburguer(nomeHamburguer);
	}

	@Test
	public void deveEntenderQueCozinheiroAdicionaTresIngredientesAoHamburguer() {
		// Arrange
		Ingrediente ingrediente1 = criaIngrediente().nome("Hamburguer de Picanha")
				.tipoIngrediente(TipoIngrediente.HAMBURGUER).build();
		Ingrediente ingrediente2 = criaIngrediente().nome("Pao Frances").tipoIngrediente(TipoIngrediente.PAO).build();
		Ingrediente ingrediente3 = criaIngrediente().nome("Tomate").tipoIngrediente(TipoIngrediente.SALADA).build();
		List<Ingrediente> ingredientes = Arrays.asList(ingrediente1, ingrediente2, ingrediente3);

		// Action
		cozinheiro.adicionaIngredientes(ingredientes);

		// Assert
		assertEquals(3, cozinheiro.getHamburguer().getIngredientes().size());
	}

	private IngredienteBuilder criaIngrediente() {
		return Ingrediente.builder();
	}

}
