package utils;

public class Configuration {
	private String version;
	private String db;
	private String confVersion;
	
	/**
	 * Constructeur
	 */
	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	/*******************************************
	 * GETTERS & SETTERS 
	 ******************************************/
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getConfVersion() {
		return confVersion;
	}

	public void setConfVersion(String confVersion) {
		this.confVersion = confVersion;
	}
	
	
}
