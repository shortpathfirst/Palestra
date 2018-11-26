import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SchedaAllenamento{
	
	private static int idScheda;
	private LocalDate inizio,fine; //l'istruttore assegna schede per un periodo
	private String difficolta;
	private Istruttore istruttore;
	private List<Esercizio> esercizi = new ArrayList<>();
	
	public SchedaAllenamento(LocalDate inizio, LocalDate fine, String difficolta, List<Esercizio> esercizi) {
		super();
		this.inizio = inizio;
		this.fine = fine;
		this.difficolta = difficolta;
		this.istruttore = GestorePalestra.assegnaResponsabileAllenamento();  
		this.esercizi = esercizi;
		//TODO assegna esercizi per gruppi muscolari (Composite) di default, in seguito con build pattern
		
	} 
	
	
}
