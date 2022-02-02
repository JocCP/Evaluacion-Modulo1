package DeliveryVerduras;

public class Pedido {
	
	private String Cliente;
	private int Codigo;
	private String Direccion;
	private String Producto;
	private int Cantidad;
	private int Monto;
	private String Empleado;
	
	public Pedido(String cliente, int codigo, String direccion, String producto, int i, int monto,
			String empleado) {
		
		Cliente = cliente;
		Codigo = codigo;
		Direccion = direccion;
		Producto = producto;
		Cantidad = i;
		Monto = monto;
		Empleado = empleado;
		
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	public String getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(String empleado) {
		Empleado = empleado;
	}
	
	

}
