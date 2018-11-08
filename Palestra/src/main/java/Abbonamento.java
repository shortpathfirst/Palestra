import java.time.LocalDate;
import java.util.Date;

public class Abbonamento {
	
	private int idAbbonamento;
	private double prezzo;
	private LocalDate inizioAbbonamento;
	private LocalDate fineAbbonamento;
	
	
	public int getIdAbbonamento() {
		return idAbbonamento;
	}
	public void setIdAbbonamento(int idAbbonamento) {
		this.idAbbonamento = idAbbonamento;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public LocalDate getInizioAbbonamento() {
		return inizioAbbonamento;
	}
	public void setInizioAbbonamento(LocalDate inizioAbbonamento) {
		this.inizioAbbonamento = inizioAbbonamento;
	}
	public LocalDate getFineAbbonamento() {
		return fineAbbonamento;
	}
	public void setFineAbbonamento(LocalDate fineAbbonamento) {
		this.fineAbbonamento = fineAbbonamento;
	}
}
