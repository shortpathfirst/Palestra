import java.util.Date;

public class PersonalePalestra {
	//Una persona che frequenta la palestra
	
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String telefono;
	private String sesso;
	private String luogoNascita;
	private Date dataNascita;
	private String ruoloPalestra;
	
	public PersonalePalestra(String codiceFiscale, String nome, String cognome, String telefono, String sesso,
			String luogoNascita, Date dataNascita, String ruoloPalestra) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.sesso = sesso;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
		this.ruoloPalestra = ruoloPalestra;
	}
	
}
