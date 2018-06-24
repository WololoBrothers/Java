package ar.edu.frgp.utn.conexionoracle;

import java.util.Properties;

public class ConnectionData {
	
	static Properties getConnectionData() {
		Properties info = new Properties();
		info.put("user","hr");
		info.put("password","hr");
		return info;	
	}
}