package br.com.vocehamburguer.model;

import br.com.vocehamburguer.enums.TipoIngrediente;
import lombok.Builder;
import lombok.Getter;

@Builder
public class Ingrediente {
	
	@Getter
	private String nome;
	
	@Getter
	private TipoIngrediente tipoIngrediente;
	
	
	public Ingrediente(final String nome, final TipoIngrediente tipoIngrediente) {
		this.nome = nome;
		this.tipoIngrediente = tipoIngrediente;
	}
}
