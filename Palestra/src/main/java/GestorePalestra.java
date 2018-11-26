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
import java.util.Random;

public class GestorePalestra {
	//liste da prelevare database
	private static List<Corso> listaCorsi = new ArrayList<>();
	private static List<Istruttore> listaIstruttori = new ArrayList<>();
	private static List<Esercizio> listaEsercizi = new ArrayList<>();
	private static List<Abbonato> listaAbbonati = new ArrayList<>();
	private static List<Ticket> listaTicket = new ArrayList<>();
	
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

	public void iscrivi(Utente u){ 
			
		    Abbonato iscritto = new Abbonato(u.getNome(),u.getCognome(), u.getTelefono(),u.getCodiceFiscale(),u.getSesso(),u.getLuogoNascita(),u.getDataNascita(),u.getProfessione());
		    this.listaAbbonati.add(iscritto); 
		    //TODO Rimuoverlo dalla lista quando l'abbonamento scade
	}
	
	public void ritira(Abbonato abbonato) {
		    // Verifica che l'iscritto sia in elenco
		    for (Abbonato a : listaAbbonati) 
		      if (a.getCodiceFiscale() == abbonato.getCodiceFiscale()) 
		        // Ritira l'iscritto da tutti i corsi di cui fa parte
		        for (Abbonamento abb : a.getAbbonamenti()) 
		        	 a.rimuoviAbbonamento(abb);	    
	}
	
	//---------------------------------------------------------------
	// Assegnazioni
	//---------------------------------------------------------------
	public void assegnaAbbonamento(Abbonato abbonato, Abbonamento abbonamento) {
		abbonato.sottoscriviAbbonamento(abbonamento);
	}
	public void assegnaTicket(UtenteOccasionale uo, Ticket t) {
		uo.acquisisciTicket(t);
	}
	public static Istruttore assegnaResponsabileAlimentazione() {
		// TODO Assegna istruttore a caso
	    Istruttore is = listaIstruttori.get(new Random().nextInt(listaIstruttori.size()));
		return is;
	}
	public static Istruttore assegnaResponsabileAllenamento() { 
		// TODO Assegna istruttore a caso
	    Istruttore is = listaIstruttori.get(new Random().nextInt(listaIstruttori.size()));
		return is;
	}
	
	//---------------------------------------------------------------
	// Statistiche
	//---------------------------------------------------------------
	public int calcolaNumeroUtentiAnnuale(List<Corso> corsi){
		//TODO come viene deciso l'utente annuale
		return 0;
	}
	public int calcolaNumeroUtentiTotale(List<Corso> corsi){
		int numStudenti = 0;
		for(Corso c : corsi)
			for(Abbonato a : c.getAbbonati()) {
				numStudenti++;
			}
		return numStudenti;
	}
	public void infoCorso(int idCorso){
		for(Corso c : listaCorsi) {
			if(c.getIdCorso() == idCorso) {
				for(Lezione l : c.getLezioni())
					System.out.println("Orario:"+l.getOrarioInizio());
				System.out.println("Partecipanti:");
				for(Abbonato a : c.getAbbonati()) {
					System.out.println(a.getNome()+" "+a.getCognome());
				}
			}
		}
	}
	
	public double calcolaGuadagnoMensile(LocalDate mese) {
		double guadagno = 0;
		for(Abbonato abbonato : listaAbbonati) { //Per ogni iscritto
			for(Abbonamento abbonamento : abbonato.getAbbonamenti()) { //Verifica i suoi abbonamenti
				if(abbonamento.getDataSottoscrizione().getMonth() == mese.getMonth()) { //filtrati per mese
					guadagno += abbonamento.getPrezzo();
				}
			}
			
		}
		return guadagno;
	}
	public double calcolaGuadagnoComplessivo() {
		double totale = 0;
		for(Corso c : listaCorsi) {
			totale += c.calcolaGuadagno();
		}
		return totale;
	}
	public int calcolaNumeroStudentiAssegnatiMaestro(Maestro m) {
		int numeroStudenti = 0;
		for(Corso c : m.getCorsiTenuti()) {
			numeroStudenti = calcolaNumeroStudentiCorso(c);
		}
		return numeroStudenti;
	}
	public int calcolaNumeroStudentiCorso(Corso c) {
		return c.getNumeroStudenti();
	}
	
	
	//---------------------------------------------------------------
	// Operazioni
	//---------------------------------------------------------------
	public void pagaAbbonamento(Abbonamento a) {
		a.setPagato(); //dipendenza da rimuovere con pattern State
	}


}
