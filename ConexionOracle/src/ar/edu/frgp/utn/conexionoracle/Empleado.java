package ar.edu.frgp.utn.conexionoracle;

import java.sql.*;
import java.util.Date;

public class Empleado {

	int id_empleado;
	String nombre;
	String apellido;
	String job_id;	
	String email;
	int dept_id;
	
	public Empleado(int id_empleado, String nombre, String apellido, String job_id, String email, int dept_id) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.job_id = job_id;		
		this.email = email;
		this.dept_id = dept_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getjob_id() {
		return job_id;
	}

	public void setjob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	@Override
	public String toString() {
		return "empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + 
			   ", job_id= " + job_id + ", email= " + email + ", dept_id = " + dept_id +"]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static void main(String[] args) {

		String SQL = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, JOB_ID, EMAIL, DEPARTMENT_ID FROM hr.employees";
		Connection con = null;
		Statement st;
		ResultSet rs;

		try {

			con = realizarConexion();

			//CREACION DE STATEMENT
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			//EJECUCION DE RESULTSET
			rs = st.executeQuery(SQL);						

			//CREACION DE ARRAY DE empleadoS
			Empleado[] empleados = new Empleado[getResultSetSize(rs)];

			//RECUPERACION DE DATOS DE empleadoS
			recuperarEmpleados(empleados, rs);

			//INFORMAR DATOS DE empleadoS
			listarEmpleados(empleados);

			//INSERTAR empleado 					
			Empleado nuevoEmpleado = new Empleado(350,"Juan","De Amos","AD_PRES", "tdeamos@frgp.utn.edu.ar", 90);
			insertarEmpleado(rs, nuevoEmpleado);

			//ELIMINAR empleado
			//eliminarEmpleado(nuevoEmpleado, con);
			
			//MODIFICAR empleado
			nuevoEmpleado = new Empleado(350,"Juan","De Amos","AD_PRES", "tdeamos@utn.edu.ar", 90);
			actualizarEmpleado(350, nuevoEmpleado, con);

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

	private static void eliminarEmpleado(Empleado empleado, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement("delete from hr.employees where employee_id = ? ");
			ps.setInt(1, empleado.getId_empleado());
			if(ps.executeUpdate() > 0)
				System.out.println("Se elimino: " + empleado.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void actualizarEmpleado(int idEmpleado, Empleado empleado, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement("update employees set last_name = ?, first_name = ?, job_id = ?, email = ? where employee_id = ? ");
			ps.setString(1, empleado.getApellido());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getjob_id());
			ps.setString(4, empleado.getEmail());
			ps.setInt(5, idEmpleado);
			if(ps.executeUpdate() > 0)
				System.out.println("Se actualizo: " + empleado.toString());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertarEmpleado(ResultSet rs, Empleado nuevoempleado) throws SQLException {
		rs.moveToInsertRow();
		rs.updateInt("EMPLOYEE_ID", nuevoempleado.getId_empleado());
		rs.updateString("FIRST_NAME", nuevoempleado.getNombre());
		rs.updateString("LAST_NAME", nuevoempleado.getApellido());
		rs.updateString("JOB_ID", nuevoempleado.getjob_id());		
		rs.updateString("EMAIL", nuevoempleado.getEmail());
		rs.updateInt("DEPARTMENT_ID", nuevoempleado.getDept_id());
		rs.insertRow();
		System.out.println("****************************************");
		System.out.println("Empleado: " + nuevoempleado.toString() + " agregado.");
	}

	private static int getResultSetSize(ResultSet rs) {
		int registros = 0;
		try {			
			rs.last();
			registros = rs.getRow();
			rs.beforeFirst();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return registros;
	}

	private static void listarEmpleados(Empleado[] empleados) {		
		for (int i = 0; i < empleados.length ; i++) {
			System.out.println("****************************************");
			System.out.println("EMPLOYEE_ID: " + empleados[i].getId_empleado());
			System.out.println("FIRST_NAME: " + empleados[i].getNombre());
			System.out.println("LAST_NAME: " + empleados[i].getApellido());
			System.out.println("JOB_ID: " + empleados[i].getjob_id());			
			System.out.println("DEPARTMENT_ID: " + empleados[i].getDept_id());
		}
	}

	private static void recuperarEmpleados(Empleado[] empleados, ResultSet rs) throws SQLException {		
		int contador = 0;		
		while (rs.next()){
			//rs.refreshRow();
			empleados[contador] = new Empleado(rs.getInt("EMPLOYEE_ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"), rs.getString("JOB_ID"), rs.getString("EMAIL"), rs.getInt("DEPARTMENT_ID"));			
			contador ++;			
		}
	}

	private static Connection realizarConexion() throws ClassNotFoundException, SQLException {
			
		//URL de conexion
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//REGISTRO DE DRIVERS
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//ESTABLECIMIENTO DE CONEXION
		Connection conn = DriverManager.getConnection(URL,"hr","hr");
		return conn;
	}
}