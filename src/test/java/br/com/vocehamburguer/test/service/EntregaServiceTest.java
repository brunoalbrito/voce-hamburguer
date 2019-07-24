package br.com.vocehamburguer.test.service;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import br.com.vocehamburguer.model.Hamburguer;
import br.com.vocehamburguer.repository.DeliveryRepository;
import br.com.vocehamburguer.service.EntregaService;

public class EntregaServiceTest {
	
	
	@Mock
	private DeliveryRepository deliveryRepository;
	
	private EntregaService servicoEntrega;

	private Hamburguer hamburguer;
	
	@Before
	public void setup() {
		deliveryRepository = mock(DeliveryRepository.class);
		servicoEntrega = new EntregaService(deliveryRepository);
	}
	
	@Test
	public void deveEntenderRealizaEntregaComHamburguerReprovado() {
		//Arrange
		hamburguer.recebeAvaliacao(false);
		
		//Action
		servicoEntrega.realizaEntrega(hamburguer);
		
		//Assert
		verify(deliveryRepository, times(0)).enviaEntrega(hamburguer);
	}
	
	@Test
	public void deveEntenderRealizaEntregaComHamburguerAprovado() {
		//Arrange
		hamburguer.recebeAvaliacao(true);
		
		//Action
		servicoEntrega.realizaEntrega(hamburguer);
		
		//Assert
		verify(deliveryRepository, times(1)).enviaEntrega(hamburguer);
	}
}
