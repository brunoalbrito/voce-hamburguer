package br.com.vocehamburguer.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.vocehamburguer.enums.TipoIngrediente;
import br.com.vocehamburguer.model.Ingrediente;

public class IngredienteTest {
	
	private Ingrediente ingrediente;
	
	@Test
	public void deveEntenderIngredienteComNomeETipoSendoHamburguer() {
		//Arrange
		
		//Action
		ingrediente = new Ingrediente(null, null);
		
		//Assert
		assertEquals("Hamburguer de Picanha", ingrediente.getNome());
		assertEquals(TipoIngrediente.HAMBURGUER, ingrediente.getTipoIngrediente());
	}
}
