import java.util.Date;

public class Utente {
	
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String telefono;
	private String sesso;
	private String luogoNascita;
	private Date dataNascita;
	private String professione;
	
	public Utente(String codiceFiscale, String nome, String cognome, String telefono, String sesso, String luogoNascita,
			Date dataNascita, String professione) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.sesso = sesso;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
		this.professione = professione;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getProfessione() {
		return professione;
	}
	public void setProfessione(String professione) {
		this.professione = professione;
	}
	
	
}
