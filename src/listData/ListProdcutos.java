package listData;

import Interface.IProdcuts;
import entidades.Prodcuts;

import java.util.ArrayList;
import java.util.List;

public class ListProdcutos implements IProdcuts {
    List<Prodcuts> listaProdcutos = new ArrayList<>();



    public List<Prodcuts> getListaProdcutos() {
        return listaProdcutos;
    }

    public void setListaProdcutos(List<Prodcuts> listaProdcutos) {
        this.listaProdcutos = listaProdcutos;
    }

    @Override
    public void getAllProdcuts() {
        this.listaProdcutos.forEach(System.out::println);
    }

    @Override
    public void addProdcuts(Prodcuts p) {
        this.listaProdcutos.add(p);
    }

    @Override
    public Prodcuts getProcusID(Integer id) {
        Prodcuts p = listaProdcutos.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return p;
    }
}
