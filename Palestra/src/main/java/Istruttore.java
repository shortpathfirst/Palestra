import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Istruttore extends PersonalePalestra {
	
	public Istruttore(String codiceFiscale, String nome, String cognome, String telefono, String sesso,
			String luogoNascita, Date dataNascita, String ruoloPalestra) {
		super(codiceFiscale, nome, cognome, telefono, sesso, luogoNascita, dataNascita, ruoloPalestra);
		// TODO Auto-generated constructor stub
	}

	private List<Corso> corsiInsegnati = new ArrayList<>();

}
