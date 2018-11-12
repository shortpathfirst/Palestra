import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UtenteOccasionale extends Utente {
	
	private List<Ticket> tickets = new ArrayList<Ticket>(); //vari ticket a vari corsi
	//private int numTicket; // vari ticket da 1 utilizzo

	public UtenteOccasionale(String nome, String cognome, String telefono, String codiceFiscale, String sesso,
			String luogoNascita, LocalDate dataNascita, String professione) {
		super(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
		// TODO Auto-generated constructor stub
	}
	
	public void acquisisciTicket() {

	}
	public void paga() {
		
	}

}
