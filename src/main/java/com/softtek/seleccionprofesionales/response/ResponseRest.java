package com.softtek.seleccionprofesionales.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {
	
	private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();

	public ArrayList<HashMap<String, String>> getMetadata() {
		return metadata;
	}

	public void setMetadata(String codigo, String mensaje, String codigoDominio, String mensajeDominio) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("codigo", codigo);
		map.put("mensaje", mensaje);
		map.put("codigoDominio", codigoDominio);
		map.put("mensajeDominio", mensajeDominio);
		
		metadata.add(map);
	}
	
	

}

