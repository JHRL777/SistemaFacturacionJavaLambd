package entidades;



public class Factura {
    private Users fusuario;
    private Prodcuts fprodcuto;


    public Factura(Users fusuario, Prodcuts fprodcuto) {
        this.fusuario = fusuario;
        this.fprodcuto = fprodcuto;
    }

    public Users getFusuario() {
        return fusuario;
    }

    public void setFusuario(Users fusuario) {
        this.fusuario = fusuario;
    }

    public Prodcuts getFprodcuto() {
        return fprodcuto;
    }

    public void setFprodcuto(Prodcuts fprodcuto) {
        this.fprodcuto = fprodcuto;
    }

    @Override
    public String toString() {
        return String.format("🧾 Usuario: %-10s | Producto: %-15s | Precio: $%,.2f",
                fusuario.getName(), fprodcuto.getNombre(), fprodcuto.getPrecio());
    }
}
