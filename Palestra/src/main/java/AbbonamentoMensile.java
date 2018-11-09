import java.time.LocalDate;

public class AbbonamentoMensile extends Abbonamento{
	private long durata;
	
	public AbbonamentoMensile(int idAbbonamento, double prezzo, LocalDate dataAbbonamento,Utente utente, long durata, boolean pagato) {
		super(idAbbonamento, prezzo, dataAbbonamento, utente, pagato);
		this.durata = durata;
	}
	

}
