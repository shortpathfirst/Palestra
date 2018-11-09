import java.time.LocalDate;

public class Ticket extends Abbonamento{
	
	private int numeroTicket;

	public Ticket(int idAbbonamento, double prezzo, LocalDate dataAbbonamento,Utente utente,boolean pagato, int numeroTicket) {
		super(idAbbonamento, prezzo, dataAbbonamento, utente,pagato);
		this.numeroTicket = numeroTicket;
	}

}
