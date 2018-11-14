import java.time.LocalDate;

public class AbbonamentoCorso extends Abbonamento{
	
	private Corso corso;
	
	public AbbonamentoCorso(int idAbbonamento, double prezzo, LocalDate dataAbbonamento, Utente utente,
			boolean pagato) {
		super(idAbbonamento, prezzo, dataAbbonamento, utente, pagato);
		// TODO Auto-generated constructor stub
	}

	

}
