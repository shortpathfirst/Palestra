import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorePalestra {
	
//	List<Corso> corsi = new ArrayList<Corso>();
	
	public static String inserisciUtente(String nome, String cognome, String telefono, String codiceFiscale, String sesso, String luogoNascita, LocalDate dataNascita, String professione) throws IOException, FileNotFoundException {
		
		Utente utente = new Utente(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
		String riga = utente.getNome() + "," +  utente.getCognome() + "," +  utente.getTelefono() + "," +  utente.getCodiceFiscale() + "," +  utente.getSesso() + "," +  utente.getLuogoNascita() + "," +  utente.getDataNascita() + "," +  utente.getProfessione();
		System.out.println(riga);
		
		InputStreamReader inFile = new InputStreamReader(new FileInputStream ("utenti.txt"),"ASCII");
	    BufferedReader buffInFile = new BufferedReader(inFile);
	    BufferedWriter buffOutFile = new BufferedWriter(new FileWriter("utenti.txt",true));
	    buffOutFile.newLine();
	    buffOutFile.write(riga);
	    buffOutFile.close();
		return "Utente aggiunto";
		
	}
	
	public void assegnaAbbonamento(Utente u, Abbonamento a) { //permette di assegnare sia Ticket che abbonamenti
		//a.setUtente(u);
	}
	
//	public void assegnaTicket(String codiceFiscale, LocalDate data) {
//	}

	public int calcolaNumeroUtentiAnnuale(List<Corso> corsi){
		//TODO come viene deciso l'utente annuale
		return 0;
	}
	public int calcolaNumeroUtentiTotale(List<Corso> corsi){
		int numStudenti = 0;
		for(Corso c : corsi)
			for(Utente u : c.getUtenti()) {
				numStudenti++;
			}
		return numStudenti;
	}
	public void infoCorso(Corso c){
		System.out.println("Orario:"+c.getOrario());
		System.out.println("Partecipanti:");
		for(Utente u : c.getUtenti()) {
			System.out.println(u.getNome()+" "+u.getCognome());
		}
	}
	public void calcolaGuadagnoCorsoMensileIscritti(Corso c) {
		
	}
	public void calcolaStudentiAssegnatiMaestro() {
		
	}
	public LocalDate DataScadenzaAbbonamento() {
		return null;
	}
	public void calcolaNumeroPartecipantiCorso() {
		
	}
	
	public void totaleTicketGiornalieri() {
		
	}
	
	public void pagaAbbonamento(Abbonamento a) {
		a.setPagato(true); //dipendenza da rimuovere con pattern State
	}
	
	
//Cambiamenti:

//	Aggiunto "Utente" in abbonamento per associarlo all'utente
//	Sostituito attributo "fineAbbonamento" in Abbonamento da "durata"
//	Rimosso TipiAbbonamento, il tipo si definisce estendendo "Abbonamento" in ticket, abbonamentoMensile, ecc.. e ridotti parametri costruttore
//	data di inizio sia per abbonamento che ticket e solo su abbonamento ho una durata
//	boolean pagato /non pagato da fare con pattern State nella v0 solo con setPagato
	
}
