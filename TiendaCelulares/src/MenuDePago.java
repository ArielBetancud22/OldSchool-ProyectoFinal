import java.util.Scanner;

public class MenuDePago {


    static Scanner scanner = new Scanner(System.in); //
    static int select = -1; //opción elegida del usuario
    static int opcion = 0; //Variables


    public static void pagar(){

            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n1.- Mercado Pago" +
                        "\n2.- Tarjeta Débito\n" +
                        "3.- Tarjeta Crédito\n" +
                        "4.- Efectivo\n" +
                        "5.- Cancelar\n");

                //variable por consola
                select = Integer.parseInt(scanner.nextLine());
            int total = Carrito.calcularPrecio();
                //Ejemplo de switch case
                switch (select) {
                    case 1:
                        System.out.println("Usted eligio Mercado Pago, posee un interés del 15%, el total es de: " + total * 1.15);
                        Carrito.clear();
                        break;
                    case 2:
                        System.out.println("Usted eligio Tarjeta  de Debito, el total es de: " + total);
                        Carrito.clear();
                        break;
                    case 3:
                        System.out.println("Usted eligio Tarjeta  de Credito, que posee un interés del 20%, el total es de: " + total * 1.2);
                        Carrito.clear();
                        break;
                    case 4:
                        System.out.println("Usted eligio Efectivo, el total es: " + total);
                        Carrito.clear();
                        break;
                    default:
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }


        }

    }






