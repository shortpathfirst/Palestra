import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Corso{
	
	private Maestro m;
	private List<Atleta> p ;
	//Orario come ulteriore classe?
	List<Map<LocalDate, LocalTime>> orario = new ArrayList<Map<LocalDate, LocalTime>>();

}
