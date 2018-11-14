import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Corso{
	
	private int idCorso;
	private String tipoCorso; 		// sostituito nome con tipoCorso
	private String sala;  			//aggiungere classe Sala? Sì, quando useremo il composite
	private Maestro maestro;
	private List<Utente> utenti;
	private LocalDate data;
	private LocalTime orario;
	
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
	public List<Utente> getUtenti() {
		return utenti;
	}
	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getOrario() {
		return orario;
	}
	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}
	

}
