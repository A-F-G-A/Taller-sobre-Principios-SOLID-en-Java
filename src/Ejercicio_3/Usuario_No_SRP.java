package Ejercicio_3;

public class Usuario_No_SRP {
    private String nombre;
    private String contraseña;
    public Usuario_No_SRP(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    // Validar usuario
    public boolean validarUsuario() {
        // Lógica de validación (ejemplo simple)
        return nombre.equals("admin") && contraseña.equals("1234");
    }
    public boolean validarContraseña(){
        // Lógica de validación (ejemplo simple)
        return contraseña.length() >= 6;
    }
}
