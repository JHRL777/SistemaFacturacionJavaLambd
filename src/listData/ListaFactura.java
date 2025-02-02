package listData;

import Interface.IFactura;
import entidades.Factura;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFactura implements IFactura {
    List<Factura> facturas = new ArrayList<>();
    double total;



    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public void getAllFacturas() {
        facturas.forEach(System.out::println);
    }

    @Override
    public void addfactura(Factura f) {
        facturas.add(f);
    }

    public double totaldefacturas(){
      return   facturas.stream().mapToDouble(x->x.getFprodcuto().getPrecio()).sum();
    }

    public void mostrarfacturaporxUsuario(){
         facturas.stream().collect(Collectors.groupingBy(x -> x.getFusuario().getName(),Collectors.summingDouble(x->x.getFprodcuto().getPrecio()))).forEach((C,P)->System.out.println(C+"-->"+P));
    }
}
