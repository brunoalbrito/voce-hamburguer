package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

import br.com.vocehamburguer.enums.TipoIngrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Ingrediente {
	
	@Getter
	private String nome;
	
	@Getter
	private TipoIngrediente tipoIngrediente;
	
	
	public boolean eValido() {
		throw new NotImplementedException("Método não implementado");
	}
}
