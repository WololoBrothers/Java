package ar.edu.frgp.utn.conexionoracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.internal.OracleTypes;
import oracle.jdbc.oracore.OracleType;

public class ConexionOracle {

	public static void main(String[] args) {

		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";		
		String SQL = "call test(?,?)";
		Connection con = null;
		
		try {

			//REGISTRO DE DRIVERS
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//ESTABLECIMIENTO DE CONEXION
			con = DriverManager.getConnection(URL, user, password);
			
			//CREACION DE STATEMENT
			//Statement st = con.createStatement();
			CallableStatement st = con.prepareCall(SQL);
			st.setInt("valor1", 1000);
			st.registerOutParameter("valor2", java.sql.Types.VARCHAR);
			st.execute();			
			
			System.out.println(st.getString("valor2"));
			
			//RECUPERACION DE DATOS				
			
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