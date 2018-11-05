import java.util.Date;

public class Abbonamento {
	
	private int idAbbonamento;
	private double prezzo;
	private Date inizioAbbonamento;
	private Date fineAbbonamento;
	
	
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
	public Date getInizioAbbonamento() {
		return inizioAbbonamento;
	}
	public void setInizioAbbonamento(Date inizioAbbonamento) {
		this.inizioAbbonamento = inizioAbbonamento;
	}
	public Date getFineAbbonamento() {
		return fineAbbonamento;
	}
	public void setFineAbbonamento(Date fineAbbonamento) {
		this.fineAbbonamento = fineAbbonamento;
	}
}
