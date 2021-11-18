package it.andreagroup.recensioni.data.entity;






public class Recensione {
	
	public static final String SEQUENCE_NAME = "recensioni_sequence";
    private long idarticolo;
	
	private Integer idrecensione;
	
	private String recensione;
	
//	private Integer idarticolo; proviamo a commentare (sequence name by ottata)

	public Integer getIdrecensione() {
		return idrecensione;
	}

	public void setIdrecensione(Integer idrecensione) {
		this.idrecensione = idrecensione;
	}

	public String getRecensione() {
		return recensione;
	}

	public void setRecensione(String recensione) {
		this.recensione = recensione;
	}

	public Integer getIdarticolo() {
		return idarticolo;
	}

	public void setIdarticolo(Integer idarticolo) {
		this.idarticolo = idarticolo;
	}
	
	
	
	
}
