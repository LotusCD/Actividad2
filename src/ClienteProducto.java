
import java.util.List;


public class ClienteProducto {
    
    
    
    private String nombre;

    
    private final List<Producto> productos;

    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
