package entidades;

import Interface.User;

public class Users  {

    static  Integer idInical = 0;
    private Integer id;
    private String name;


    public Users(String name) {
        Users.setIdInical();
        this.id = Users.getIdInical();
        this.name = name;
    }

    public Users() {

    }

    public static Integer getIdInical() {
        return idInical;
    }

    public static void setIdInical() {
        Users.idInical++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("👤 ID: %-3d | Nombre: %s", id, name);
    }
}
