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

	@Mock
	private Hamburguer hamburguer;

	private EntregaService servicoEntrega;

	@Before
	public void setup() {
		hamburguer = mock(Hamburguer.class);
		deliveryRepository = mock(DeliveryRepository.class);
		servicoEntrega = new EntregaService(deliveryRepository);
	}

	@Test
	public void deveEntenderRealizaEntregaComHamburguerReprovado() {
		// Arrange
		when(hamburguer.isAprovado()).thenReturn(false);

		// Action
		servicoEntrega.realizaEntrega(hamburguer);

		// Assert
		verify(deliveryRepository, times(0)).enviaEntrega(hamburguer);
	}

	@Test
	public void deveEntenderRealizaEntregaComHamburguerAprovado() {
		// Arrange
		when(hamburguer.isAprovado()).thenReturn(true);

		// Action
		servicoEntrega.realizaEntrega(hamburguer);

		// Assert
		verify(deliveryRepository, times(1)).enviaEntrega(hamburguer);
	}
}
