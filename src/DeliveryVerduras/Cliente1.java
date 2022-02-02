package DeliveryVerduras;

public class Cliente1 {
	
	private String Nombre;
	private String Direccion;
	private int Codigo;
	private int Rut;
	
	public Cliente1(String nombre, String direccion, int codigo, int rut) {
		
		Nombre = nombre;
		Direccion = direccion;
		Codigo = codigo;
		Rut = rut;
	}

	public  void Cliente (String nombre, String direccion, int codigo, int rut) {
		
		Nombre = nombre;
		Direccion = direccion;
		Codigo = codigo;
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}
	
	
	}

	
	
	
	
	
	


