import java.util.ArrayList;
import java.util.Scanner;

public class MenuItemMostrar {

    private ArrayList<Celular> lista;

    public MenuItemMostrar(ArrayList<Celular> lista) {
        this.lista = lista;
    }


    public void mostrarLista() {
        Integer contador = 1;
        System.out.println("Elija Opcion");

        for (Celular celular : this.lista) {
            System.out.println(contador + " " + celular);
            contador++;

        }
        System.out.println(contador + " Volver ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una Opcion");
        Integer opcion = entrada.nextInt();
        opcion--;
        if (opcion >= 0 && opcion < this.lista.size()) {
            Celular celularElegido = this.lista.get(opcion);
            System.out.println("Elegiste el celular ");
            System.out.println(celularElegido);
            System.out.println("Desea agregar este celular al carrito");
            System.out.println("1.Si");
            System.out.println("2.No");
            Integer opcion2 = entrada.nextInt();
            if (opcion2 == 1) {
                Carrito.agregar(celularElegido);
                System.out.println(new Carrito());
            }

        } else {
            System.out.println("Elegiste volver");
        }
    }
}
