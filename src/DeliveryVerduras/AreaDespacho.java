package DeliveryVerduras;

public class AreaDespacho {
	
	private int Codigo;
	private String Descripcion;
	private int Cantidad;
	private String Direccion;
	private String Empleado;
	private String Producto;
	
	public AreaDespacho(int codigo, String descripcion, int cantidad, String direccion, String empleado,
			String producto) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		Cantidad = cantidad;
		Direccion = direccion;
		Empleado = empleado;
		Producto = producto;
	}
	

	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	public AreaDespacho(int codigo, String descripcion, int cantidad, String direccion, String empleado) {
		
		Codigo = codigo;
		Descripcion = descripcion;
		Cantidad = cantidad;
		Direccion = direccion;
		Empleado = empleado;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(String empleado) {
		Empleado = empleado;
	}
	
	

}
