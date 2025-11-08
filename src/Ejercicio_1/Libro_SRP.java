
package Ejercicio_1;

// clase Libro(Solo con datos)
public class Libro_SRP {
    private String titulo;
    private String autor;

    public Libro_SRP(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    // Clase reporte 
    public static class Reporte {
        public void generarReporte(Libro_SRP libro) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
        }
    }
    // Clase para guardar en base de datos
    public static class BaseDeDatos {
        public  void guardarEnBaseDeDatos(Libro_SRP libro) {
            System.out.println("Guardando el libro en la base de datos...");
        }
    }
    //Clase de prueba
    public static void main(String[] args) {
        Libro_SRP libro = new Libro_SRP("Cien Años de Soledad", "Gabriel García Márquez");

        // Generar reporte
        Reporte reporte= new Reporte();
        
        reporte.generarReporte(libro);

        // Guardar en base de datos
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.guardarEnBaseDeDatos(libro);
    }
}
