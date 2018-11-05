import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Corso{
	
	private int idCorso;
	private String nome; //oppure meglio la tipologia??
	private String sala;
	private Maestro m;
	private List<Utente> p ;
	//Orario come ulteriore classe?
	List<Map<LocalDate, LocalTime>> orario = new ArrayList<Map<LocalDate, LocalTime>>();
	//private Sala s;
}
