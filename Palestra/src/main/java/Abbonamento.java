import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Abbonamento {
	
	private int idAbbonamento;			
	private double prezzo;
	private LocalDate inizioAbbonamento;
	private LocalDate fineAbbonamento;
	private String tipoAbbonamento;
	private Utente utente;
	private boolean pagato;
	
	public Abbonamento(int idAbbonamento, double prezzo, LocalDate inizioAbbonamento, Utente utente, boolean pagato) {
		super();
		this.idAbbonamento = idAbbonamento;
		this.prezzo = prezzo;
		this.inizioAbbonamento = inizioAbbonamento;
		this.utente = utente;
		this.pagato = pagato;
	}
	public long durata() { 
		return ChronoUnit.DAYS.between(inizioAbbonamento, fineAbbonamento);
	}
	
	public void setPagato(boolean valore) {
		
	}
	
	
	
	
	
	
	

	
}
