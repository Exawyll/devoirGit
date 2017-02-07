package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurationJdbc {

	//URL de connexion
	  private String url;
	  //Nom du user
	  private String user;
	  //Mot de passe de l'utilisateur
	  private String passwd;
	  //Objet Connection
	  private static Connection connect;
	  

	//Constructeur privé
	  private ConfigurationJdbc(){

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
	   
	  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	   public static Connection getInstance(String url, String user, String passwd){
		   
	    if(connect == null){
	      new ConfigurationJdbc();
	      System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
	    } else {
	      System.out.println("CONNEXION SQL EXISTANTE ! ");
	    }
	    return connect;   
	  }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static Connection getConnect() {
		return connect;
	}

	public static void setConnect(Connection connect) {
		ConfigurationJdbc.connect = connect;
	}
	   
	   
}
