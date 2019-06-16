package br.com.vocehamburguer.repository;

import br.com.vocehamburguer.model.Hamburger;

public interface DeliveryRepository {
	public void enviaEntrega(final Hamburger hamburger);
}
