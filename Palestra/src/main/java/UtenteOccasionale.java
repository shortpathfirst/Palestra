import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UtenteOccasionale extends Utente {
	
	private List<Ticket> tickets = new ArrayList<Ticket>(); //vari ticket a vari corsi
	private Collection<Ticket> tickts;

	public UtenteOccasionale(String nome, String cognome, String telefono, String codiceFiscale, String sesso,
			String luogoNascita, LocalDate dataNascita, String professione, List<Ticket> tickets) {
		super(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
		this.tickets = tickets;
	}
	
	public void acquisisciTicket(Ticket t) { //nuovo ticket ad un corso
		this.tickets.add(t);
	}
	public void utilizzaTicket(int idCorso) {
		for(Ticket t : tickets)
			if(t.getCorso().getIdCorso() == idCorso)
				this.tickets.removeIf(x -> t.getNumeroTicket() == 1); 
			else
				t.utilizzaTicket();
	}

}
