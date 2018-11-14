import java.time.LocalDate;

public class Ticket extends Abbonamento{
	
	private int numeroTicket;

	public Ticket(int idAbbonamento, double prezzo, LocalDate inizioAbbonamento, LocalDate fineAbbonamento,
			String tipoAbbonamento, Utente utente, boolean pagato, int numeroTicket) {
		super(idAbbonamento, prezzo, inizioAbbonamento, fineAbbonamento, tipoAbbonamento, utente, pagato);
		this.numeroTicket = numeroTicket;
	}



	

}
