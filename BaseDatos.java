import java.util.ArrayList;

public class BaseDatos {
    public static ArrayList<Producto> productos = new ArrayList<>();

    public static Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
}

