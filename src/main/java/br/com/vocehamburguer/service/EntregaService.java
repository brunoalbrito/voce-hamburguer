package br.com.vocehamburguer.service;

import br.com.vocehamburguer.model.Hamburguer;
import br.com.vocehamburguer.repository.DeliveryRepository;

public class EntregaService {
	
	private DeliveryRepository deliveryRepository;
	
	public EntregaService(final DeliveryRepository deliveryRepository) {
		this.deliveryRepository = deliveryRepository;
	}
	
	public void realizaEntrega(final Hamburguer hamburguer) {
		if(hamburguer.isAprovado())
			envia(hamburguer);
	}
	
	private void envia(final Hamburguer hamburguer) {
		deliveryRepository.enviaEntrega(hamburguer);
	}
}
