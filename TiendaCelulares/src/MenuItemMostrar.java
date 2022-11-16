import java.util.ArrayList;

public class MenuItemMostrar {

    private  ArrayList<Celular> lista;

    public MenuItemMostrar(ArrayList<Celular> lista) {
        this.lista = lista;
    }
    public void mostrarLista(){
        for (Celular celular:this.lista){
            System.out.println("celular = " + celular);

        }


    }
}
