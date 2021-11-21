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

	public void eliminarProducto(String codigo) {
		Producto producto = this.consultarProducto(codigo);

		if(this.verificarProducto(producto) != -1) {
			this.productos.remove(indice);
			System.out.println("El producto fue eliminado exitosamente.");
		}else {
			System.out.println("El producto ingresado no existe.");
		}

	}
	public void agregarProducto() {
		
	}


	public  int verificarProducto(Producto producto) {
		int indiceProductoEnInventario = recorrerProducto(producto)
		if (indiceProductoEnInventario != -1) {
			return recorrerProducto(producto);
		}
		return -1;
	}

	public int recorrerProducto(Producto producto) {
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


	public static void registrar(String codigo, String nombre, int cantidad) {
		Producto p = new Producto(codigo,nombre, cantidad);
		int indiceDelProductoEnInventario = this.verificarProducto(p)
		if( indiceDelProductoEnInventario == -1) {
			this.agregarProducto(p);
			System.out.println("Producto ingresado con �xito.");
		}else {
			System.out.println("El producto ya existe.");
		}
	}
	
}
