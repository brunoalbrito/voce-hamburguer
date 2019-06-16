package br.com.vocehamburguer.test.service;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import br.com.vocehamburguer.model.Hamburger;
import br.com.vocehamburguer.repository.DeliveryRepository;
import br.com.vocehamburguer.service.EntregaService;

public class EntregaServiceTest {
	
	
	@Mock
	private DeliveryRepository deliveryRepository;
	
	private EntregaService servicoEntrega;

	private Hamburger hamburger;
	
	@Before
	public void setup() {
		deliveryRepository = mock(DeliveryRepository.class);
		servicoEntrega = new EntregaService(deliveryRepository);
	}
	
	@Test
	public void deveEntenderRealizaEntragaComHamburgerReprovado() {
		//Arrange
		
		//Action
		servicoEntrega.realizaEntrega(hamburger);
		
		//Assert
		verify(deliveryRepository, times(0)).enviaEntrega(hamburger);
	}
	
	@Test
	public void deveEntenderRealizaEntragaComHamburgerAprovado() {
		//Arrange
		
		//Action
		servicoEntrega.realizaEntrega(hamburger);
		
		//Assert
		verify(deliveryRepository, times(1)).enviaEntrega(hamburger);
	}
}
