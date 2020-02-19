package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Ingrediente;

public class IngredienteTest {

	private Ingrediente ingrediente;

	private String nomeIngrediente;

	private TipoIngrediente tipoIngrediente;

	@Before
	public void init() {
		nomeIngrediente = "Hamburguer de Picanha";
		tipoIngrediente = TipoIngrediente.HAMBURGUER;
		ingrediente = new Ingrediente(nomeIngrediente, tipoIngrediente);
	}

	@Test
	public void deveEntenderIngredienteComNomeETipoSendoHamburguer() {
		// Assert
		assertEquals(nomeIngrediente, ingrediente.getNome());
		assertEquals(tipoIngrediente, ingrediente.getTipoIngrediente());
	}

}
