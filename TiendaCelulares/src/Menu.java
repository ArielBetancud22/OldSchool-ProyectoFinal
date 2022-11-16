import java.util.Scanner;

public class Menu {
    public static void display(){
        System.out.println("1.Motorola");
        System.out.println("2.Apple");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija opcion");
        Integer opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                MenuItemMostrar menu = new MenuItemMostrar(StockCel.getListaMotorola());
                menu.mostrarLista();

        }
    }
}
