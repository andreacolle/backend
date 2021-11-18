package it.andreagroup.articoli.data.dto;

import java.util.List;

public class ArticoloDTO {

	private String nomearticolo;
	
	private List<RecensioneDTO> recensioni;

	public String getNomearticolo() {
		return nomearticolo;
	}

	public void setNomearticolo(String nomearticolo) {
		this.nomearticolo = nomearticolo;
	}

	public List<RecensioneDTO> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<RecensioneDTO> recensioni) {
		this.recensioni = recensioni;
	}
	
	

	
}
