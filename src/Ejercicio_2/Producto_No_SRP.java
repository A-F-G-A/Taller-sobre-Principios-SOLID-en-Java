package Ejercicio_2;

public class Producto_No_SRP{
    private String nombre;
    private double precio;

    public Producto_No_SRP(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // Calcular precio
    public double Calcular_Iva() {
        return precio * 0.12;
    }

    // etiqueta
    public void Generar_Etiqueta() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + Calcular_Iva());
    }

}