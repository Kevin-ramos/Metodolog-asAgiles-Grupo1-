import java.util.ArrayList;

public class Inventario {
	ListaProductos productos = new ListaProductos();
	
	
	
	public ListaProductos getProductos() {
		return productos;
	}

	public void setProductos(ListaProductos productos) {
		this.productos = productos;
	}

	public void actualizarCantidad(int nuevaCantidad, String codigo) {
		Producto producto =  this.consultarProducto(codigo);
		if(this.verificarProducto(producto) != -1) {
			this.productos.getListaProductos().get(this.verificarProducto(producto)).setCantidad(nuevaCantidad);
			System.out.println("El producto fue eliminado exitosamente.");
		}else {
			System.out.println("El producto ingresado no existe.");
		}
		
	}

	public  int verificarProducto(Producto producto) {
		int indiceProductoEnInventario = recorrerProducto(producto);
		if (indiceProductoEnInventario != -1) {
			return recorrerProducto(producto);
		}
		return -1;
	}

	public int recorrerProducto(Producto producto) {
		int indice = 0;
		for (Producto p : this.productos.getListaProductos()) {
			if (producto.equals(p)) {
				return indice;
			}
			indice ++ ;
		}
		return -1;
	}


	public Producto consultarProducto(String codigo) {
		for (Producto p : this.productos.getListaProductos()) {
			if (p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}


	public static void registrar(String codigo, String nombre, int cantidad, Inventario inventario) {
		Producto p = new Producto(codigo,nombre, cantidad);
		int indiceDelProductoEnInventario = inventario.verificarProducto(p);
		if( indiceDelProductoEnInventario == -1) {
			inventario.getProductos().agregarProducto(p);
			System.out.println("Producto ingresado con éxito.");
		}else {
			System.out.println("El producto ya existe.");
		}
	}
	
}
