package models;

public class Persona {
    private String nombre;
    private byte edad;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, byte edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override 
    public String toString() {
        return "Persona -> " +
                "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Género: " + genero;
    }
}
