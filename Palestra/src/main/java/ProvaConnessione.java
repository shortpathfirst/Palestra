
public class ProvaConnessione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnessioneDataBase c  = new ConnessioneDataBase();
		String nome = "Luca";
		String cognome = "Bianchi";
		c.inserisciUtente(nome, cognome);
		
	}

}
