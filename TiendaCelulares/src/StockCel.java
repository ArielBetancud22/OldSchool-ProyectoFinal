import java.util.ArrayList;

public class StockCel {
    private static ArrayList<Celular> listaMotorola = new ArrayList<>();

    private static void llenarMotorola(){
        Celular cel1 = new Celular("Motorola", "Moto g200", "Snapdragon 880","108mp x 13mp", 90000);

        listaMotorola.add(cel1);
    }

    public static ArrayList<Celular> getListaMotorola() {
        return listaMotorola;
    }

    public static void init() {
        llenarMotorola();

    }

}

