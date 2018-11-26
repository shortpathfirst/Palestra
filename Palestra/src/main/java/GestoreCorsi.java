
public class GestoreCorsi {
	//---------------------------------------------------------------
	// Corso
	//---------------------------------------------------------------
	public void inserimentoCorso(Corso corso) {
		
	}
	public void aggiormamentoCorso(Corso c1, Corso c2) {
		
	}
	public Corso rimomzioneCorso(String idCorso) {
		return null;
	}
	//---------------------------------------------------------------
	// Lezioni
	//---------------------------------------------------------------
	public void assegnaLezione(Lezione lezione) {
		//Aggiunge lezione alla lista lezioni del corso
	}
	public Lezione rimomzioneLezione(String idLezione) {
		return null;
	}
	//---------------------------------------------------------------
	// Operazioni
	//---------------------------------------------------------------
	public void registraUtente(Utente utente, Corso corso) {
//		//Se l'utente ha un abbonamento lo registra al corso
//		for (AbbonamentoCorso a : listaAbbonamenti) 
//			if(a.getUtente() == utente && corso.tipoCorso() == a.Corso.TipoCorso()) {
//				
//			}	
	}
	public void disiscriviUtente(Utente utente, Corso corso) {
		
	}
	//---------------------------------------------------------------
	// Info Corso
	//---------------------------------------------------------------
	public String infoCorso(Corso c) {
//		for(Lezione l : c.getLezioni())
//			System.out.println("Orario:"+l.getOrarioInizio());
//		System.out.println("Partecipanti:");
//		for(Utente u : c.getUtenti()) {
//			System.out.println(u.getNome()+" "+u.getCognome());
//		}
		return "";
	}
}
