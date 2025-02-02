package entidades;

public class Prodcuts {
    static  Integer idIncio = 0;
    private Integer id;
    private String nombre;
    private  double precio;

    public Prodcuts(String nombre, double precio) {
        Prodcuts.setIdIncio();
        this.id = Prodcuts.getIdIncio();
        this.nombre = nombre;
        this.precio = precio;
    }


    public static Integer getIdIncio() {
        return idIncio;
    }

    public static void setIdIncio() {
        Prodcuts.idIncio++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("🛒 ID: %-3d | Producto: %-15s | Precio: $%,.2f", id, nombre, precio);
    }
}
