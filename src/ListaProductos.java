import java.util.ArrayList;

public class ListaProductos {
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void agregarProducto( Producto producto) {
		getListaProductos().add(producto);
	}

	public void eliminarProducto(Inventario inventario, String codigo) {
		Producto producto = inventario.consultarProducto(codigo);
	  
		if(inventario.verificarProducto(producto) != -1) {
			getListaProductos().remove(inventario.verificarProducto(producto));
			System.out.println("El producto fue eliminado exitosamente.");
		}else {
			System.out.println("El producto ingresado no existe.");
		}
	
	}
	
	
	
	
	
}