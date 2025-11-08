package Ejercicio_1;
// clase Libro (con varias responsabilidades)
public class Libro_No_SRP {
    private String titulo;
    private String autor;

    public Libro_No_SRP(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    // informacion
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    // generar reporte
    public void generarReporte() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
    //Guardar en archivo
    public void GuardarenBaseDeDatos() {
        System.out.println("Guardando el libro en la base de datos...");
    }




}