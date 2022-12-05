
public class Main {
    public static void main(String[] args) {
        if (Login.login()) {
            StockCel.init();
            Menu.display();


        }
        else {
            System.out.println("Login Fallido");
        }
    }
}