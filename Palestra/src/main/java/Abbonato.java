import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Abbonato extends Utente {
	
	List<Abbonamento> abbonamenti = new ArrayList<Abbonamento>();

	public Abbonato(String nome, String cognome, String telefono, String codiceFiscale, String sesso,
			String luogoNascita, LocalDate dataNascita, String professione) {
		super(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
		// TODO Auto-generated constructor stub
	}
	public void sottoscriviAbbonamento(Abbonamento a) {
		this.abbonamenti.add(a);
	}
	public void rimuoviAbbonamento(Abbonamento a) {
		this.abbonamenti.remove(a);
	}

}
