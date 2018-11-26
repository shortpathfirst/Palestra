import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Abbonato extends Utente { 
	
	List<Abbonamento> abbonamenti = new ArrayList<Abbonamento>();
	Istruttore istruttore;  //associazione con istruttore opzionale
	//tessera abbonamento
	
	
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
	public void associaIstruttore(Istruttore is) {
		this.istruttore = is;
	}
	public void rimuoviIstruttore() {
		this.istruttore = null;
	}
	
	public List<Abbonamento> getAbbonamenti() {
		return abbonamenti;
	}
}
