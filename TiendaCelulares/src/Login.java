import java.util.Scanner;

public class Login {
    public static boolean login() {
        String usuario1 = "ariel";
        String contraseña1 = "1234";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dijite su usuario: ");
        var usuario =entrada.nextLine();
        System.out.println("Digite su contraseña: ");
        var contraseña = entrada.nextLine();

        if(usuario.equals(usuario1)  && contraseña.equals(contraseña1)){
            return true;
        }  else {
            return false;
        }
    }
}


