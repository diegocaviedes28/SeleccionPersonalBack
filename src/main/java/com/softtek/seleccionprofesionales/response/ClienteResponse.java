package com.softtek.seleccionprofesionales.response;
import java.util.*;

import com.softtek.seleccionprofesionales.model.Cliente;

public class ClienteResponse {
	private List<Cliente> cliente;

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
}
