package Ejercicio_3;

public class Usuario_SRP {
    private String nombre;
    private String contraseña;
    public Usuario_SRP(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public String getContraseña() {
        return contraseña;
    }

}
// autenticacion
class Autenticacion {
    public boolean validarUsuario(Usuario_SRP usuario) {
        // Lógica de validación (ejemplo simple)
        return usuario.getNombre().equals("admin") && usuario.getContraseña().equals("1234");
    }
}
//validar contraseña
class ValidadorContraseña {
    public boolean validarContraseña(Usuario_SRP usuario){
        // Lógica de validación (ejemplo simple)
        return usuario.getContraseña().length() >= 6;
    }
}
// clase de prueba
