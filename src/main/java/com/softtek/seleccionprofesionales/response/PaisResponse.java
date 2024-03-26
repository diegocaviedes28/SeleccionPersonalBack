package com.softtek.seleccionprofesionales.response;
import java.util.*;

import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.model.Pais;

public class PaisResponse {
	private List<Pais> pais;

	public List<Pais> getPais() {
		return pais;
	}

	public void setPais(List<Pais> pais) {
		this.pais = pais;
	}
}
