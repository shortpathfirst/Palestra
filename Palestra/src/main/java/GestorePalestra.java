import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class GestorePalestra {
	
	public static void main(String[] args) throws IOException{
		
		
		LocalDate myDate =LocalDate.parse("2014-02-14");
		String a =  inserisciUtente("Mario", "Rossi", "0792893", "aoshdqeqw213123","m","perugia", myDate,"studente");
		System.out.println(a);
		
	}
	
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
	
	public TipiAbbonamento assegnaAbbonamento(String codiceFiscale, TipiAbbonamento ta) {
		return ta;
	}
	
	public void assegnaTicket(String codiceFiscale, LocalDate data) {
		//
	}
	public int calcolaNumeroStudentiAnnuale(){
		return 0;
	}
	public int calcolaNumeroStudentiTotale(){
		return 0;
	}
	public List<Lezione> infoCorso(Corso c){
		c.getId();
		return null;
	}
	public void calcolaGuadagnoCorsoMensileIscritti(Corso c) { // DA CHIEDERE AL PROFF
		
	}
	public void calcolaStudentiAssegnatiMaestro() {}
	public LocalDate DataScadenzaAbbonamento() {
	
	}
	public void calcolaNumeroPartecipantiCorso() {
		
	}
	
	public void totaleTicketGiornalieri() {
		
	}
	
}
