import java.util.ArrayList;

public class Inventario {
	private ArrayList<Producto> productos;
	
	
	public Inventario() {
		super();
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	

	public void actualizarCantidadProducto() {
		
	}
	public void eliminarProducto() {
		this.productos.remove
		
	}
	public void agregarProducto() {
		
	}
	
	public static Producto verificarProducto(Producto producto) {
		for (Producto p : this.productos) {
			if (producto.equals(p)) {
				return p;
			}
		}
		return null;
	}

	
	
	
	
}
