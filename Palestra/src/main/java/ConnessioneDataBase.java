import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnessioneDataBase {
	private static Connection conn;
	
	public static boolean connect(){
		boolean result=false;
		try {
			//caricamento driver
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql:Palestra?user=postgres&password=admin");
			result=true;
			System.out.println("Connection Established!Now you can manage the database!");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void closeConn() {
		if(conn != null) {
			try {

				conn.close();

			}catch(Exception v) {

			}

		}

	}
	
	
	final static String inserisciUtente = "INSERT INTO Utente (Nome,Cognome) VALUES ("+ "?, ?) returning id";
	
	public String inserisciUtente(String name,String cognome) {
		String id = "";
		try{
			//stabilisco la connessione
			connect();
			String inserisciDocente1 = "INSERT INTO ciao ( Nome, Cognome) VALUES ('mario', 'rossi')";	
			
			PreparedStatement pstm = conn.prepareStatement(inserisciDocente1);
			//set values
			pstm.setString(1, name );
			pstm.setString(2, cognome);
			//insert
			ResultSet rst = pstm.executeQuery();
			if(rst.next()) {
				id = rst.getString(1);
			}

			pstm.close();

			System.out.println("ID è:: "+ id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn();
		}
		
		
		return id;
		
	}

	
	
}
