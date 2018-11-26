import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Corso{
	
	private int idCorso;
	private String tipoCorso; 		
	private String sala;  			//aggiungere classe Sala? Sì, quando useremo il composite
	private Maestro maestro;
	private List<Abbonato> abbonati;
	private List<Lezione> lezioni= new ArrayList<>();
	private double prezzoLezione; //ogni lezione di un corso ha un prezzo fisso
	
	
	public Corso(int idCorso, String tipoCorso, String sala, Maestro maestro, List<Abbonato> abbonati,
			List<Lezione> lezioni) {
		super();
		this.idCorso = idCorso;
		this.tipoCorso = tipoCorso;
		this.sala = sala;
		this.maestro = maestro;
		this.abbonati = abbonati;
		this.lezioni = lezioni;
		this.prezzoLezione = 20; //DEFAULT
	}

	public int getIdCorso() {
		return idCorso;
	}

	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}

	public String getTipoCorso() {
		return tipoCorso;
	}

	public void setTipoCorso(String tipoCorso) {
		this.tipoCorso = tipoCorso;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}

	public List<Abbonato> getAbbonati() {
		return abbonati;
	}

	public void setAbbonati(List<Abbonato> abbonati) {
		this.abbonati = abbonati;
	}

	public List<Lezione> getLezioni() {
		return lezioni;
	}

	public void setLezioni(List<Lezione> lezioni) {
		this.lezioni = lezioni;
	}
	
	public double getPrezzoLezione() {
		return this.prezzoLezione;
	}
	public void setPrezzoLezione(double value) {
		this.prezzoLezione = value;
	}
	//---------------------------------------------------------------
	// Operazioni
	//---------------------------------------------------------------
	public void ritiraAbbonato(Abbonato a) {
		this.abbonati.remove(a);
	}

	public double calcolaGuadagno() {
		double guadagno = 0;
		for(Abbonato a : abbonati) {
			guadagno += this.prezzoLezione;
		}
		return guadagno;
	}

	public int getNumeroStudenti() {
		return this.abbonati.size();
	}
	

}
