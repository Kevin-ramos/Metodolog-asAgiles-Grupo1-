
public class Producto {
	
private String codigo;
private String nombre;
private int cantidad;

public Producto(String codigo, String nombre, int cantidad) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.cantidad = cantidad;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public static void registrar(String codigo, String nombre, int cantidad, Inventario inventario) {
	Producto p = new Producto(codigo,nombre, cantidad);
	if(inventario.verificarProducto(p) == -1) {
		inventario.agregarProducto(p);
		System.out.println("Producto ingresado con éxito.");
	}else {
		System.out.println("El producto ya existe.");
	}
}

@Override
public String toString() {
	return "Código= " + codigo + ", Nombre= " + nombre + ", Cantidad= " + cantidad + ".";
}

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
	Producto p=(Producto)obj;
		return p.getNombre().equals(this.getNombre()) && p.getCodigo().equals(this.getCodigo());

	}
}

