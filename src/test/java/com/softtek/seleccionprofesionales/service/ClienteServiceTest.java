//package com.softtek.seleccionprofesionales.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//
//import com.softtek.seleccionprofesionales.dao.ClienteDao;
//import com.softtek.seleccionprofesionales.model.Cliente;
//import com.softtek.seleccionprofesionales.response.ClienteResponseRest;
//
//public class ClienteServiceTest {
//	@InjectMocks
//	@Autowired
//	ClienteServiceimpl service;
//
//	@Mock
//	ClienteDao clienteDao;
//	
//	List<Cliente> list = new ArrayList<Cliente>();
//	
//	@BeforeEach
	/*
	 * public void init() { MockitoAnnotations.openMocks(this);
	 * this.cargarClientes(); }
	 */
	
	
//	@Test
//	@Disabled
//	public void obtenerClienteIdTest(long id_cliente) {
//		when(clienteDao.findById(id_cliente)).thenReturn(list);
//		ResponseEntity<ClienteResponseRest> response = service.obtenerClienteID(id_cliente);
//		assertEquals(4, response.getBody().getClienteResponse().getCliente().size());
//		verify(clienteDao, times(1)).findById(id_cliente);
//	}
//	
//	@Test
//	@Disabled
//	public void obtenerClienteTest() {
//		when(clienteDao.findAll()).thenReturn(list);
//		ResponseEntity<ClienteResponseRest> response = service.obtenerCliente();
//		assertEquals(4, response.getBody().getClienteResponse().getCliente().size());
//		verify(clienteDao, times(1)).findAll();
//	}
	
//	@Test
//	public void guardarClienteTest(Cliente request) {
//		when(clienteDao.save(request)).thenReturn(request);
//		ResponseEntity<ClienteResponseRest> response = service.guardarCliente(request);
//		assertEquals(3, response.getBody().getClienteResponse().getCliente().size());
//		verify(clienteDao, times(1)).save(request);
//	}
	
	/*
	 * public void cargarClientes() { Cliente cliUno = new Cliente(Long.valueOf(1),
	 * "prueuno", "1", "2"); Cliente cliDos = new Cliente(Long.valueOf(1),
	 * "pruedos", "1", "2"); Cliente cliTres = new Cliente(Long.valueOf(1),
	 * "pruetres", "1", "2"); Cliente cliCuatro = new Cliente(Long.valueOf(1),
	 * "pruecuatro", "1", "2");
	 * 
	 * list.add(cliUno); list.add(cliDos); list.add(cliTres); list.add(cliCuatro); }
	 */
	
	
//}
