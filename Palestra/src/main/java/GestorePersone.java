import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class GestorePersone {
	//---------------------------------------------------------------
	// Utente
	//---------------------------------------------------------------
	public void inserisciUtente(Utente u) {
		
//		Utente utente = new Utente(nome, cognome, telefono, codiceFiscale, sesso, luogoNascita, dataNascita, professione);
//		String riga = utente.getNome() + "," +  utente.getCognome() + "," +  utente.getTelefono() + "," +  utente.getCodiceFiscale() + "," +  utente.getSesso() + "," +  utente.getLuogoNascita() + "," +  utente.getDataNascita() + "," +  utente.getProfessione();
//		System.out.println(riga);
//		
//		InputStreamReader inFile = new InputStreamReader(new FileInputStream ("utenti.txt"),"ASCII");
//	    BufferedReader buffInFile = new BufferedReader(inFile);
//	    BufferedWriter buffOutFile = new BufferedWriter(new FileWriter("utenti.txt",true));
//	    buffOutFile.newLine();
//	    buffOutFile.write(riga);
//	    buffOutFile.close();
//		return "Utente aggiunto";	
	}
	public void aggiormamentoUtente(Utente u1, Utente u2) {
		
	}
	public Utente rimomzioneUtente() {
		return null;
	}
	//---------------------------------------------------------------
	// Info Persone 
	//---------------------------------------------------------------
	public String infoPersone() {
		return "";
	}
}
