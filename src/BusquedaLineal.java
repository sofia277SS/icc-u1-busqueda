import java.util.List;

import models.Persona;

public class BusquedaLineal {
    
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }

    // Metodo para buscar una persona
    // Retornar si lo encuentra
    // Si no, retornar null
    public Persona findByName(String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre)) {
                return personas.get(i);
            }
        }
        return null;
    }

    // Metodo para buscar la posicion de una persona
    // Retornar la posicion si lo encuentra
    // Si no, retornar -1
    public int findPosByName(String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}
