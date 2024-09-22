public class Gato {
    // Atributos
    private String nombre;
    private int edad;
    private String raza;

    // Constructor
    public Gato(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // Método para mostrar información del gato
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Raza: " + raza;
    }

    // Método para hacer que el gato maulle
    public String maullar() {
        return nombre + " dice: ¡Miau!";
    }
}

