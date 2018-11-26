import java.util.List;

public class SchedaAlimentazione{
	private String descrizione;
	private Istruttore istruttore; //Personale che si occupa della scheda alimentazione
	//private List<String> alimenti;
	
	public SchedaAlimentazione(String descrizione) {
		super();
		this.descrizione = descrizione;
		this.istruttore = GestorePalestra.assegnaResponsabileAlimentazione();  
	}

}
