import java.util.ArrayList;

public class Inventario {
	private ArrayList<Producto> productos;
	
	
	public Inventario() {
		super();
	}

	public void actualizarCantidadProducto() {
		
	}
	
	public boolean verificarProducto(Producto producto) {
		for (Producto p : this.productos) {
			if (producto.equals(p)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
}
