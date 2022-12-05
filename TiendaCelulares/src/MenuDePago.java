import java.util.Scanner;

public class MenuDePago {


    static Scanner scanner = new Scanner(System.in); //
    static int select = -1; //opción elegida del usuario
    static int opcion = 0; //Variables


    public static void pagar(){
        //Mientras la opción elegida sea 0, preguntar
        while (select != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n1.- Mercado Pago" +
                        "\n2.- Tarjeta Débito\n" +
                        "3.- Tarjeta Crédito\n" +
                        "4.- Efectivo\n" +
                        "5.- Menú Principal\n" +
                        "6.- Salir ");
                //variable por consola
                select = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case
                switch (select) {
                    case 1:
                        pedirNumeros();
                        System.out.println("Usted eligio Mercado Pago, posee un interés del 15%, el total es de: ");
                        break;
                    case 2:
                        pedirNumeros();
                        System.out.println("Usted eligio Tarjeta  de Debito, el total es de: ");
                        break;
                    case 3:
                        pedirNumeros();
                        System.out.println("Usted eligio Tarjeta  de Credito, que posee un interés del 20%, el total es de: ");
                        break;
                    case 4:
                        pedirNumeros();
                        System.out.println("Usted eligio Efectivo, ingrese con cuánto va a pagar: ");
                        break;
                    case 5:
                        pedirNumeros();
                        System.out.println("Usted eligio volver al Menú Principal");
                        break;
                    case 6:
                        System.out.println("Usted eligio Salir , Gracias por visitarnos!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }


        }

    }

    //Variables por consola
    public static void pedirNumeros() {
        System.out.println("Ingrese una opción");
        opcion = Integer.parseInt(scanner.nextLine());

        //Mostrar un salto de línea en Java
        System.out.println("\n");
    }
}


