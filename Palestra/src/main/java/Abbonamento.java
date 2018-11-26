import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Abbonamento {
	
	private int idAbbonamento;			
	private double prezzo;
	private LocalDate inizioAbbonamento;
	private LocalDate fineAbbonamento;
	private String tipoAbbonamento;
	private Utente utente;
	private boolean pagato;
	private LocalDate dataSottoscirzione;
	

	public Abbonamento(int idAbbonamento, double prezzo, LocalDate inizioAbbonamento, LocalDate fineAbbonamento,
			String tipoAbbonamento, Utente utente) {
		super();
		this.idAbbonamento = idAbbonamento;
		this.prezzo = prezzo;
		this.inizioAbbonamento = inizioAbbonamento;
		this.fineAbbonamento = fineAbbonamento;
		this.tipoAbbonamento = tipoAbbonamento;
		this.utente = utente;
		this.pagato = false;
		this.dataSottoscirzione = LocalDate.now();
	}

	public long durata() { 
		return ChronoUnit.DAYS.between(inizioAbbonamento, fineAbbonamento);
	}
	
	public void setPagato() {
		this.pagato = true;
	}

	public LocalDate getDataSottoscrizione() {
		return this.dataSottoscirzione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
	
	

	
}
