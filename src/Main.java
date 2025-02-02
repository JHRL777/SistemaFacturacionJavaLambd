import entidades.Factura;
import entidades.Prodcuts;
import entidades.Users;
import listData.ListProdcutos;
import listData.ListaFactura;
import listData.listUser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        listUser listaUsuarios = new listUser();

        // CLIENTES
        listaUsuarios.setUser(new Users("JUAN"));
        listaUsuarios.setUser(new Users("MARIA"));
        listaUsuarios.setUser(new Users("PEDRO"));
        listaUsuarios.setUser(new Users("ENRIQUE"));
        // PRODUCTOS
        ListProdcutos producto1 = new ListProdcutos();
        producto1.addProdcuts(new Prodcuts("computadro",2000000));
        producto1.addProdcuts(new Prodcuts("teclado", 70000));
        producto1.addProdcuts(new Prodcuts("Mouse",15000));
        producto1.addProdcuts(new Prodcuts("Monitor",100000));

        //FACTURAS
        ListaFactura facturas = new ListaFactura();
        facturas.addfactura(new Factura(listaUsuarios.getUserid(1),producto1.getProcusID(1)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(1),producto1.getProcusID(2)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(1),producto1.getProcusID(3)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(2),producto1.getProcusID(4)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(2),producto1.getProcusID(1)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(3),producto1.getProcusID(3)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(3),producto1.getProcusID(1)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(3),producto1.getProcusID(2)));
        facturas.addfactura(new Factura(listaUsuarios.getUserid(3),producto1.getProcusID(4)));



        System.out.println("══════════════════════════════════════════════════");
        System.out.println("                  📋 USUARIOS                     ");
        System.out.println("══════════════════════════════════════════════════");
        listaUsuarios.getAlluser();

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("                 🛍️ PRODUCTOS                     ");
        System.out.println("══════════════════════════════════════════════════");
        producto1.getAllProdcuts();

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("                   🧾 FACTURAS                     ");
        System.out.println("══════════════════════════════════════════════════");
        facturas.getAllFacturas();

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("              👤 TOTAL POR USUARIO                 ");
        System.out.println("══════════════════════════════════════════════════");
        facturas.mostrarfacturaporxUsuario();

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("                 💰 TOTAL GENERAL                  ");
        System.out.println("══════════════════════════════════════════════════");
        System.out.printf("Total de todas las facturas: $%,.2f%n", facturas.totaldefacturas());

        System.out.println("══════════════════════════════════════════════════");
        System.out.println("                   ✅ FIN DEL REPORTE              ");
        System.out.println("══════════════════════════════════════════════════");

    }
}