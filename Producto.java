public class Producto {
    private String codigo,nombre,detalle;
    private int stock;
    private double precio;

    public Producto(String codigo, String nombre, String detalle, int stock, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.detalle=detalle;
        this.stock=stock;
        this.precio=precio;

    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



}
