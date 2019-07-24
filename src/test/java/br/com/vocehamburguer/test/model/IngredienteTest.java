package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Ingrediente;

public class IngredienteTest {

	private Ingrediente ingrediente;

	private String nomeIngrediente;

	private TipoIngrediente tipoIngrediente;

	public void init() {
		nomeIngrediente = "Hamburguer de Picanha";
		tipoIngrediente = TipoIngrediente.HAMBURGUER;
		ingrediente = new Ingrediente(null, null);
	}

	@Test
	public void deveEntenderIngredienteComNomeETipoSendoHamburguer() {
		// Assert
		assertEquals(nomeIngrediente, ingrediente.getNome());
		assertEquals(tipoIngrediente, ingrediente.getTipoIngrediente());
	}
}
