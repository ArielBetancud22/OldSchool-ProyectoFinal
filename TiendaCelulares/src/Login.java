import java.util.Scanner;

public class Login {
    public static boolean login() {
        var usuario1 = "ariel";
        var contraseña1 = 1234;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dijite su usuario: ");
        var usuario = Integer.parseInt(entrada.nextLine());
        String usuarioS = Integer.toString(usuario) ;
        System.out.println("Digite su contraseña: ");
        var contraseña = Integer.parseInt(entrada.nextLine());

        if(usuarioS == usuario1 || contraseña == contraseña1) {
            return true;
        }  else {
            return false;
        }
    }
}

