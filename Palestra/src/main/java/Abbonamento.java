import java.time.LocalDate;

public class Abbonamento {
	
	private int idAbbonamento;			
	private double prezzo;
	private LocalDate dataAbbonamento;
	private Utente utente;
	private boolean pagato;
	
	public Abbonamento(int idAbbonamento, double prezzo, LocalDate dataAbbonamento, Utente utente, boolean pagato) {
		super();
		this.idAbbonamento = idAbbonamento;
		this.prezzo = prezzo;
		this.dataAbbonamento = dataAbbonamento;
		this.utente = utente;
		this.pagato = pagato;
	}
	public int getIdAbbonamento() {
		return idAbbonamento;
	}
	public void setIdAbbonamento(int idAbbonamento) {
		this.idAbbonamento = idAbbonamento;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public LocalDate getDataAbbonamento() {
		return dataAbbonamento;
	}
	public void setDataAbbonamento(LocalDate dataAbbonamento) {
		this.dataAbbonamento = dataAbbonamento;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public boolean isPagato() {
		return pagato;
	}
	public void setPagato(boolean pagato) {
		this.pagato = pagato;
	}
	
	

	
}
