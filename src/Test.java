
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.out.println("Bienvenido al Sistema de inventario para bodegas de alimentos (SIBA)");
		
		int opcion;
		int opcion2;
	    Scanner entrada = new Scanner(System.in);
	    
	    Producto.registrar("1", "Manzana",30, inventario);
	    Producto.registrar("2", "Pera", 50, inventario);
	    Producto.registrar("3", "Lata de Atún", 100, inventario);
	    Producto.registrar("4", "Quintal de Arroz", 10, inventario);
	    Producto.registrar("5", "Chocolate Galak", 33, inventario);
	    
		do{
			
            System.out.println("\nMENÚ DE OPCIONES \n"
                                + "1.- Productos \n"
                                + "2.- Salir.\n");
            System.out.print("Ingrese el número de opción que desea: ");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    
                	do{
            			
                        System.out.println("\n******************************Productos******************************  \n"
                                            + "1.- Registrar \n"
                                            + "2.- Consultar \n"
                                            + "3.- Eliminar \n"
                                            + "4.- Regresar.\n");
                        System.out.print("Ingrese el número de opción que desea: ");
                        opcion2 = entrada.nextInt();
                        entrada.nextLine();
                        switch (opcion2){
                            case 1:
                            	String codigo;
                            	String nombre;
                            	int cantidad;
                            	System.out.print("Ingrese el codigo del nuevo producto: ");
                            	codigo = entrada.nextLine();
                            	System.out.print("Ingrese el nombre del nuevo producto: ");
                            	nombre = entrada.nextLine();
                            	System.out.print("Ingrese el cantidad del nuevo producto: ");
                            	cantidad = entrada.nextInt();
                            	entrada.nextLine();
                            	Producto.registrar(codigo, nombre, cantidad, inventario);
                                break;
                            case 2:
                            	System.out.print("Ingrese el código del producto a consultar: ");
                            	codigo = entrada.nextLine();
                            	Producto producto = inventario.consultarProducto(codigo);
                            	if (producto == null) {
                            		System.out.println("Producto no encontrado.");
                            	}else
                            		System.out.println(producto);
                                break;
                            case 3:
                            	System.out.print("Ingrese el código del producto a eliminar: ");
                            	codigo = entrada.nextLine();
                                inventario.eliminarProducto(codigo);
                                break;
                            case 4:
                                System.out.println("\nSaliendo de Producto.\n");
                                break;
                            default:
                                System.out.println("ERROR: La opción ingresada no esta permitida ingrese otra.");
                                break;
                        }
                	}while (opcion2!=4);
                    break;
                case 2:
                    System.out.println("Saliendo... Muchas Gracias.");
                    break;
                default:
                    System.out.println("ERROR: La opción ingresada no esta permitida ingrese otra.");
                    break;
            }
    }while (opcion!=2);

	}

}
