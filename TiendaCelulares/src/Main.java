
public class Main {
    public static void main(String[] args) {
        if (Login.login()) {
            StockCel.init();
            boolean salir = false;
            while (!salir) {
                int opcion = Menu.display();
                if (opcion == 8) {
                    salir = true;
                }
            }


        } else {
            System.out.println("Login Fallido");

        }

    }
}
