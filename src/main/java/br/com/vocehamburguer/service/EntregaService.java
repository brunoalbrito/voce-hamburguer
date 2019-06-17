package br.com.vocehamburguer.service;

import org.apache.commons.lang3.NotImplementedException;

import br.com.vocehamburguer.model.Hamburger;
import br.com.vocehamburguer.repository.DeliveryRepository;

public class EntregaService {
	
	private DeliveryRepository deliveryRepository;
	
	public EntregaService(final DeliveryRepository deliveryRepository) {
		this.deliveryRepository = deliveryRepository;
	}
	
	public void realizaEntrega(final Hamburger hamburger) {
		envia(hamburger);
		throw new NotImplementedException("Metodo nao implementado");
	}
	
	private void envia(final Hamburger hamburger) {
		deliveryRepository.enviaEntrega(hamburger);
	}
}
