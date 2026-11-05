import java.util.List;

import models.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", (byte) 25, "M"),
            new Persona("Maria", (byte) 30, "F"),
            new Persona("Pedro", (byte) 20, "M"),
            new Persona("Ana", (byte) 28, "F")
        );
        BusquedaLineal busqueda = new BusquedaLineal(personas);

        //1. Buscar una persona con nombre "Maria"
        Persona personaEncontrada = busqueda.findByName("Maria");
        if (personaEncontrada == null) {
            System.out.println("Persona no encontrada");
        } else {
            System.out.println("Persona encontrada: " + personaEncontrada);
        }
        //2. Buscar una persona con nombre "Diego"
        Persona personaEncontrada2 = busqueda.findByName("Diego");
        if (personaEncontrada2 == null) {
            System.out.println("Persona no encontrada");
        } else {
            System.out.println("Persona encontrada: " + personaEncontrada2);
        }
        //3. Buscar la posición de una persona con nombre "Ana"
        int posicionEncontrada = busqueda.findPosByName("Ana");
        if (posicionEncontrada == -1) {
            System.out.println("Persona no encontrada");
        } else {
            System.out.println("La posicion de Ana es " + posicionEncontrada);
        }
    }
}
