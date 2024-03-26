package com.softtek.seleccionprofesionales.response;

public class PostulanteResponseRest extends ResponseRest{
	private PostulanteResponse postulanteResponse = new PostulanteResponse();

	public PostulanteResponse getPostulanteResponse() {
		return postulanteResponse;
	}

	public void setPostulanteResponse(PostulanteResponse postulanteResponse) {
		this.postulanteResponse = postulanteResponse;
	}
}
