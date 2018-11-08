import java.util.Date;

public class GestorePalestra {
	
	public void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Date data = new Date(1990,10,10);
		String a =  inserisciUtente("Mario", "Rossi", "0792893", "aoshdqeqw213123","m","perugia", data,"studente");
		System.out.println(a);
		
	}
	
	public String inserisciUtente(String nome, String cognome, String telefono, String codiceFiscale, String sesso, String luogoNascita, Date dataNascita, String professione) {
		
		Utente utente = new Utente(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
		
		return "Utente aggiunto";
		
	}
	
	
}
