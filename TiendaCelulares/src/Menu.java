import java.util.Scanner;

public class Menu {
    public static void display(){
        System.out.println("1.Motorola");
        System.out.println("2.Apple");
        System.out.println("3. LG");
        System.out.println("4.Huawei");
        System.out.println("5. Xiaomi");
        System.out.println("6.Samsung");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija opcion");
        Integer opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                MenuItemMostrar menuMotorola = new MenuItemMostrar(StockCel.getListaMotorola());
                menuMotorola.mostrarLista();
                break;
            case 2:
                MenuItemMostrar menuApple = new MenuItemMostrar(StockCel.getListaApple());
                menuApple.mostrarLista();
                break;

            case 3:
                MenuItemMostrar menuLg = new MenuItemMostrar(StockCel.getListaLg());
                menuLg.mostrarLista();
                break;

            case 4:
                MenuItemMostrar menuHuawei = new MenuItemMostrar(StockCel.getListaHuawei());
                menuHuawei.mostrarLista();
                break;

            case 5: MenuItemMostrar menuXiaomi = new MenuItemMostrar(StockCel.getListaXiaomi());
            menuXiaomi.mostrarLista();
            break;

            case 6: MenuItemMostrar menuSamnsung = new MenuItemMostrar(StockCel.getListaSamsung());
            menuSamnsung.mostrarLista();
            break;
        }
    }
}

