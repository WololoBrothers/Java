package ar.edu.frgp.utn.conexionoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class ConexionOracleProperties {

	public static void main(String[] args) {

		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//Variante Properties 1
		Properties info = new Properties();
		info.put("user","hr");
		info.put("password","hr");
		
		//Variante Properties 2
		Properties info2 = ConnectionData.getConnectionData();
		
		String SQL = "SELECT * FROM hr.employees";
		Connection con = null;
		
		try {

			//REGISTRO DE DRIVERS
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//ESTABLECIMIENTO DE CONEXION
			con = DriverManager.getConnection(URL, info2);
			
			//CREACION DE STATEMENT
			Statement st = con.createStatement();
			//st = con.prepareCa

			//EJECUCION DE RESULTSET
			ResultSet rs = st.executeQuery(SQL);
			
			//RECUPERACION DE DATOS
			while (rs.next()) {
				System.out.println("**********************************************");
				System.out.println("ID DE EMPLEADO: "+ rs.getInt("employee_id"));
				System.out.println("NOMBRE: "+ rs.getString("first_name"));
				System.out.println("APELLIDO: "+ rs.getString("last_name"));
				System.out.println("JOB ID: "+ rs.getString("job_id"));
				System.out.println("FECHA CONTRATACION: "+ rs.getDate("hire_date"));
			}			

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}	
}