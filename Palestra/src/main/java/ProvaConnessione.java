
public class ProvaConnessione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnessioneDataBase c  = new ConnessioneDataBase();
		
		c.connect();
		String nome =  "MArio";
		String cognome = "Rossi";
		c.inserisciUtente(nome, cognome);
		c.closeConn();
	}

}
