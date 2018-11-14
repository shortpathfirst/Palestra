import java.time.LocalDate;

public class AbbonamentoCorso extends Abbonamento{
	
	private Corso corso;

	public AbbonamentoCorso(int idAbbonamento, double prezzo, LocalDate inizioAbbonamento, LocalDate fineAbbonamento,
			String tipoAbbonamento, Utente utente, boolean pagato, Corso corso) {
		super(idAbbonamento, prezzo, inizioAbbonamento, fineAbbonamento, tipoAbbonamento, utente, pagato);
		this.corso = corso;
	}
	


	

}
