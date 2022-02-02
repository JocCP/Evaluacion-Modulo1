package DeliveryVerduras;

import java.util.ArrayList;
public class Ventas {
	
	private static String Nombre = null;
	private int Codigo;
	private String Cliente;
	private int Monto;
	private String Producto;
	private ArrayList<ListaProducto> producto;
	
	
	
	public void setProducto(ArrayList<ListaProducto> producto) {
		this.producto = producto;
	}

	public Ventas(int codigo, String cliente, int monto, ArrayList<ListaProducto> producto,
			ArrayList<ListaProducto> producto2) {
		super();
		Codigo = codigo;
		Cliente = cliente;
		Monto = monto;
		Producto = producto;
		producto = producto2;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public Ventas(int codigo, String cliente, int monto, String producto) {
		super();
		Codigo = codigo;
		Cliente = cliente;
		Monto = monto;
		Producto = producto;
	}

	public Ventas(int codigo, String nombre, int monto) {
		
		Codigo = codigo;
		Nombre = nombre;
		Monto = monto;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}
	

}
