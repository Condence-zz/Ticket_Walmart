import java.util.ArrayList;
import java.util.Scanner; 
public class menu {
    Scanner tec = new Scanner(System.in);
    ArrayList<Producto> arrayList = new ArrayList<Producto>(); 
    private int Opcion;
    private String OpcionString;
    private float totalp=0;
    public menu(){ 
    }
    public void desplegarMenu(){

        System.out.println("1. Agregar Producto");
        System.out.println("2. Editar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Consultar Ticket");  
        System.out.println("5. Terminar");

        System.out.print("\n Teclee su opción: ");
        Opcion = tec.nextInt(); 
        switch (Opcion) {
            case 1:  agregarProducto();
                     break;
            case 2:  editarProducto();
                     break;
            case 3:  eliminarProducto();
                     break;
            case 4:  consultarTicket();
                     break;  
            case 5:  terminar();
                     break;
            default: System.out.println("Opción no válida, ingrese una del 1 al 5.");
                     break;
        }
    }
    private void agregarProducto(){  
        System.out.print("Ingrese el nombre del producto que quiere agregar: ");
        String nombre = tec.next();
        System.out.print("Ingrese el sku del producto que quiere agregar: ");
        int sku = tec.nextInt();
        System.out.print("Ingrese el precio producto que quiere agregar: ");
        float precio = tec.nextFloat();
        Producto producto = new Producto(sku,nombre,precio); 
        arrayList.add(producto);  
        System.out.println("Producto Agregado...");
        System.out.print("Deseas agregar otro producto? S/N: ");
        String sorn = tec.next();
        if (sorn.equalsIgnoreCase("S")) {
            agregarProducto();
        } else {
            desplegarMenu(); 
        } 
    }
    
    private void editarProducto(){ 
        System.out.print("Ingrese el nombre del producto que quieres modificar: ");
        String nombre = tec.next(); 
        for (Producto producto: arrayList) { 
            if (nombre.equalsIgnoreCase(producto.getNombre())) {
                System.out.println("---------------------------------------");
                System.out.println("Nombre: "+producto.getNombre());
                System.out.println("Precio: "+producto.getPrecio());
                System.out.println("SKU: "+producto.getSku()); 
                System.out.println("---------------------------------------");
                System.out.println("Editar Producto"); 
                System.out.println("---------------------------------------");
                System.out.println("1) Nombre");
                System.out.println("2) SKU");
                System.out.println("3) Precio");
                System.out.print("Ingrese una opción: ");
                Opcion = tec.nextInt(); 
                switch (Opcion) {
                    case 1: System.out.print("Nuevo nombre del producto: ");
                            String nuevoNombre = tec.next();
                            System.out.print("Estas seguro que quieres cambiar el nombre: "+producto.getNombre()+" a "+nuevoNombre+" S/N: ");
                            String sorn = tec.next();
                            if (sorn.equalsIgnoreCase("S")) {
                                producto.setNombre(nuevoNombre);
                                System.out.println("Nombre cambiado con exito..."); 
                                desplegarMenu();
                            } else {
                                desplegarMenu(); 
                            } 
                            break;
                    case 2: System.out.print("Nuevo SKU del producto: ");
                            int nuevoSKU = tec.nextInt();
                            System.out.print("Estas seguro que quieres cambiar el SKU: "+producto.getSku()+" a "+nuevoSKU+" S/N: ");
                            sorn = tec.next();
                            if (sorn.equalsIgnoreCase("S")) {
                                producto.setSku(nuevoSKU);
                                System.out.println("SKU cambiado con exito..."); 
                                desplegarMenu();
                            } else {
                                desplegarMenu(); 
                            } 
                            break;
                    case 3: System.out.print("Nuevo Precio del producto: ");
                            Float nuevoPrecio = tec.nextFloat();
                            System.out.print("Estas seguro que quieres cambiar el Precio: "+producto.getSku()+" a "+nuevoPrecio+" S/N: ");
                            sorn = tec.next();
                            if (sorn.equalsIgnoreCase("S")) {
                                producto.setPrecio(nuevoPrecio);
                                System.out.println("Precio cambiado con exito..."); 
                                desplegarMenu();
                            } else {
                                desplegarMenu(); 
                            } 
                    default: System.out.println("Opción no válida..");
                             editarProducto(); 
                             break;
                }
            }
        } 
    }
    private void eliminarProducto(){
        System.out.print("Nombre del producto: ");
        String nombre = tec.next();
        for(int i = 0; i < arrayList.size(); i++) { 
            if (nombre.equalsIgnoreCase(arrayList.get(i).getNombre())) {
                System.out.println("---------------------------------------");
                System.out.println("Nombre: "+arrayList.get(i).getNombre());
                System.out.println("Precio: "+arrayList.get(i).getPrecio());
                System.out.println("SKU: "+arrayList.get(i).getSku()); 
                System.out.println("---------------------------------------");
                System.out.print("Eliminar Producto S/N: ");
                String sorn = tec.next();
                if (sorn.equalsIgnoreCase("S")) {
                    arrayList.remove(i);
                    System.out.println("Producto Eliminado....");
                    desplegarMenu();
                } else {
                    desplegarMenu();
                } 
            }
        }
    } 
    private void terminar(){
        System.exit(0);
    }
    private void consultarTicket(){ 
        System.out.println("------------------------------"); 
        arrayList.forEach((producto) -> {
            System.out.println("Nombre: "+producto.getNombre()+ " Precio: "+producto.getPrecio()+ " SKU: "+producto.getSku());
            totalp=totalp+producto.getPrecio();
        });
        System.out.println("------------------------------"); 
        
        System.out.println("Total: "+totalp);
        System.out.println("------------------------------"); 
        System.out.print("1) Volver al menú.\n");
        System.out.print("2) Salir del programa.\n");
        System.out.print("Ingrese una opción: ");
        int sorn2 = tec.nextInt();
        if (sorn2 == 1) {
            System.out.println("------------------------------"); 
            desplegarMenu();
        } else {
            terminar();
        }
    }
}