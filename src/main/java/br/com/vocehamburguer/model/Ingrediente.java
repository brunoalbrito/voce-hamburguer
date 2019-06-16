package br.com.vocehamburguer.model;

import br.com.vocehamburguer.enums.TipoIngrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Ingrediente {
	
	@Getter
	private String nome;
	
	@Getter
	private TipoIngrediente tipoIngrediente;
	
}
