import java.util.ArrayList;

public class Carrito {
    private static ArrayList<Celular> carrito = new ArrayList<>();
    static void agregar(Celular celular){
        carrito.add(celular);

    }
    static int calcularPrecio(){
        int precio = 0;
        for (Celular celular:carrito){
            precio += celular.getPrecio();


        }
        return precio;

    }
    @Override
    public String toString() {
    if (carrito.isEmpty()){
        return "Carrito vacio";
    }

        final StringBuilder sb = new StringBuilder("Carrito\n");

        for (Celular celular:carrito){
            sb.append(celular.toString());
            sb.append("\n");

        }
        String cantidad = "Cantidad de productos: " +carrito.size();
        String precio = "El total es : $ " +calcularPrecio();
        sb.append(cantidad);
        sb.append("\n");
        sb.append(precio);



        return sb.toString();
    }

    static void clear(){
        carrito.clear();
    }

}
