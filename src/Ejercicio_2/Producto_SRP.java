package Ejercicio_2;

// clase Producto (con varias responsabilidades)
public class Producto_SRP{

    private String nombre;
    private double precio;

    public Producto_SRP(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // informacion
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

// Clase para calcular precio
    public static class Calculadora{
        public double Calcular_Iva(Producto_SRP producto) {
            return producto.getPrecio() * 0.12;
        }
    }

    // Clase para generar etiqueta
    public static class Etiqueta {
        public void Generar_Etiqueta(Producto_SRP producto, Calculadora calculadoraIVA) {
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("IVA: " + calculadoraIVA.Calcular_Iva(producto));
        }
    }

    // calse de prueba
    public static void main(String[] args) {
        Producto_SRP producto = new Producto_SRP("Laptop", 15.000000);
        Calculadora calculadora = new Calculadora();
        Etiqueta etiqueta = new Etiqueta();

        System.out.println("IvA: " + calculadora.Calcular_Iva(producto));
        etiqueta.Generar_Etiqueta(producto, calculadora);

    }

}
