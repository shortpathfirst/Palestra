import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class Lezione {
	
	private int idLezione;
	private int giornoSettimanale; // numero da 1 a 7
	private LocalTime orarioInizio;
	private LocalTime orarioFine;
	
	public Lezione(int idLezione, int giornoSettimanale, LocalTime orarioInizio, LocalTime orarioFine) {
		super();
		this.idLezione = idLezione;
		this.giornoSettimanale = giornoSettimanale;
		this.orarioInizio = orarioInizio;
		this.orarioFine = orarioFine;
	}

	public int getIdLezione() {
		return idLezione;
	}

	public void setIdLezione(int idLezione) {
		this.idLezione = idLezione;
	}

	public int getGiornoSettimanale() {
		return giornoSettimanale;
	}

	public void setGiornoSettimanale(int giornoSettimanale) {
		this.giornoSettimanale = giornoSettimanale;
	}

	public LocalTime getOrarioInizio() {
		return orarioInizio;
	}

	public void setOrarioInizio(LocalTime orarioInizio) {
		this.orarioInizio = orarioInizio;
	}

	public LocalTime getOrarioFine() {
		return orarioFine;
	}

	public void setOrarioFine(LocalTime orarioFine) {
		this.orarioFine = orarioFine;
	}
	



}
