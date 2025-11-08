package Ejercicio_3;
// clase principal para probar SRP
public class Main {
    public static void main(String[] args) {
        Usuario_SRP usuario = new Usuario_SRP("admin", "1234");
        Autenticacion autenticacion = new Autenticacion();
        ValidadorContraseña validador = new ValidadorContraseña();

        System.out.println("Usuario válido: " + autenticacion.validarUsuario(usuario));
        System.out.println("Contraseña válida: " + validador.validarContraseña(usuario));
    }
}
