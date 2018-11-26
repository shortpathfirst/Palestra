import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Maestro extends PersonalePalestra{
	
	List<Corso> corsiTenuti = new ArrayList<>();
	
	
	public Maestro(String codiceFiscale, String nome, String cognome, String telefono, String sesso,
			String luogoNascita, Date dataNascita, String ruoloPalestra) {
		super(codiceFiscale, nome, cognome, telefono, sesso, luogoNascita, dataNascita, ruoloPalestra);
	}
	
	public void aggiungiCorso(Corso c) {
		this.corsiTenuti.add(c);
	}
	public void rimuoviCorso(Corso c) {
		this.corsiTenuti.remove(c);
	}
	public List<Corso> getCorsiTenuti() {
		return this.corsiTenuti;
	}
}
