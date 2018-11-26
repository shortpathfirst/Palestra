import java.time.LocalDate;

public class Ticket{ 
	private int idTicket;
	private int numeroTicket;
	private Corso corso; //corso a cui si riferisce
	private LocalDate dataTicket; 
	
	public Ticket(int idTicket, int numeroTicket, Corso corso) {
		super();
		this.idTicket = idTicket;
		this.numeroTicket = numeroTicket;
		this.corso = corso;
		this.dataTicket = LocalDate.now(); //determinata in fase creazione
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}
	
	public void utilizzaTicket() {
		if(numeroTicket > 0)
			this.numeroTicket--;
	}
	public void acquisisciTicket() {
		this.numeroTicket++;
	}
	





	

}
