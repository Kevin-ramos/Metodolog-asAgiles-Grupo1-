import java.util.ArrayList;

public class Inventario {
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
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
	public void eliminarProducto(String codigo) {
		Producto producto = this.consultarProducto(codigo);
		int indice = this.verificarProducto(producto);
		if(indice != -1) {
			this.productos.remove(indice);
			System.out.println("El producto fue eliminado exitosamente.");
		}else {
			System.out.println("El producto ingresado no existe.");
		}
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public  int verificarProducto(Producto producto) {
		int indice = 0;
		for (Producto p : this.productos) {
			if (producto.equals(p)) {
				return indice;
			}
			indice ++ ;
		}
		return -1;
	}
	
	public Producto consultarProducto(String codigo) {
		for (Producto p : this.productos) {
			if (p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}
	

	
}
