import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnessioneDataBase {
	private static Connection conn = null;
	
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql:Palestra";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "postgres";
	
	public static boolean connect(){
		boolean result=false;
		try {
			//caricamento driver
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
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
	
	
	//final static String inserisciUtente = "INSERT INTO Utente (Nome,Cognome) VALUES ("+ "?, ?) returning id";
	
	public void inserisciUtente(String nome, String cognome) {
		
		
		PreparedStatement pstm = null;
		
		String id = "";
		try{
			//stabilisco la connessione
			connect();
			//String inserisciDocente1 = "INSERT INTO ciao (Nome, Cognome) VALUES (?, ?)";	
			String inserisciDocente1 = "INSERT INTO ciao" + "(Nome, Cognome) VALUES" + "(?,?)";
			
			pstm = conn.prepareStatement(inserisciDocente1);
			//set values
			pstm.setString(1, nome );
			pstm.setString(2, cognome);
			pstm.executeUpdate();
			//insert
			//ResultSet rst = pstm.executeQuery();
			/*if(rst.next()) {
				id = rst.getString(1);
			}*/

			pstm.close();

			System.out.println("ID è:: "+ id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn();
		}
		
		
		//return id;
		
	}

	
	
}
