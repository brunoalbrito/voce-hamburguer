package br.com.vocehamburguer.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

import br.com.vocehamburguer.enums.StatusPosAvaliacao;
import lombok.Getter;

public class Hamburger {
	
	@Getter
	private String nome;
	
	@Getter
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	
	public Hamburger(final String nome) {
		throw new NotImplementedException("M�todo n�o implementado");
	}
	
	@Getter
	private StatusPosAvaliacao posAvaliacao;
	
	public void adicionaIngrediente(final Ingrediente ingrediente) {
		throw new NotImplementedException("M�todo n�o implementado");
	}
	
	public void recebeAvaliacao(final StatusPosAvaliacao posAvaliacao) {
		throw new NotImplementedException("M�todo n�o implementado");
	}
	
	
	public boolean hamburguerAprovado() {
		throw new NotImplementedException("M�todo n�o implementado");
	}
	
}