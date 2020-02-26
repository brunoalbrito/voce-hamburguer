package br.com.vocehamburguer.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Hamburguer {

	@Getter
	private String nome;

	@Getter
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	private boolean posAvaliacao;

	public Hamburguer(final String nome) {
		this.nome = nome;
	}

	public void adicionaIngrediente(final Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);

	}

	public void recebeAvaliacao(final Avaliacao avaliacao) {
		this.posAvaliacao = avaliacao.isResultadoAvaliacao();
	}

	public boolean isAprovado() {
		return posAvaliacao;
	}

}