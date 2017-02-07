package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {

	//URL de connexion
	  private String url = "jdbc:mysql://localhost/haras";
	  //Nom du user
	  private String user = "root";
	  //Mot de passe de l'utilisateur
	  private String passwd = "";
	  //Objet Connection
	  private static Connection connect;
	   
	  //Constructeur priv�
	  private Configuration(){
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
          // Setup the connection with the DB
          connect = DriverManager
                          .getConnection(url, user, passwd);
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	   
	  //M�thode qui va nous retourner notre instance et la cr�er si elle n'existe pas
	   public static Connection getInstance(){
	    if(connect == null){
	      new Configuration();
//	      System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
	    } else {
//	    	System.out.println("CONNEXION SQL EXISTANTE ! ");
	    }
	    return connect;   
	  }
}
