package listData;

import Interface.User;
import entidades.Users;

import java.util.ArrayList;
import java.util.List;

public class listUser implements User {
    List<Users> listaUser = new ArrayList<>();


    public List<Users> getListaUser() {
        return listaUser;
    }

    public void setListaUser(List<Users> listaUser) {
        this.listaUser = listaUser;
    }


    @Override
    public void getAlluser() {
        listaUser.forEach(System.out::println);
    }

    @Override
    public void setUser(Users user) {
        listaUser.add(user);
    }

    @Override
    public Users getUserid(Integer id) {
      Users usuario =   listaUser.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
      return usuario;
    }



}
