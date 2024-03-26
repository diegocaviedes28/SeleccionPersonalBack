package com.softtek.seleccionprofesionales.dto;

public class SeniorityDto {
	
	private String seniority;

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	@Override
	public String toString() {
		return "SeniorityDto [seniority=" + seniority + "]";
	}

}
