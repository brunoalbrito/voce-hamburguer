package br.com.vocehamburguer.model;

import org.apache.commons.lang3.NotImplementedException;

import br.com.vocehamburguer.enums.TipoIngrediente;
import lombok.Getter;

public class Ingrediente {
	
	@Getter
	private String nome;
	
	@Getter
	private TipoIngrediente tipoIngrediente;
	
	
	public Ingrediente(final String nome, final TipoIngrediente tipoIngrediente) {
		throw new NotImplementedException("Metodo nao implementado");
	}
}
