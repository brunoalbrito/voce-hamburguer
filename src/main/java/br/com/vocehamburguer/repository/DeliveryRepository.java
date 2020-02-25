package br.com.vocehamburguer.repository;

import br.com.vocehamburguer.model.Hamburguer;

public interface DeliveryRepository {

	void enviaEntrega(final Hamburguer hamburguer);

}
