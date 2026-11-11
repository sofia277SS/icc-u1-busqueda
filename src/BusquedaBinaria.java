import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Persona;

public class BusquedaBinaria {
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas) {
        this.personas = new ArrayList<>(personas);
    }

    public int findByName2(String nombre){
        //Ordenado -> Nombre
        personas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        //Busqueda binaria
        //1. Definir los limites de busqueda
        int bajo = 0;
        int alto = personas.size() - 1;
        //2. Definir el bucle de busqueda
        while (bajo <= alto) {
            //3. Calcular el medio
            int medio = (bajo + alto) / 2;
            // 4. Comparar el nombre del medio con el nombre buscado
            int comparacion = personas.get(medio).getNombre().compareTo(nombre);
            if (comparacion == 0) {
                return medio;
            }
            // 5. Verificar si es mayor o menor y escoger un lado
            else if (comparacion > 0) {
                // El nombre del medio es mayor al buscado -> buscar a la izquierda
                alto = medio - 1;
            }else {
                // El nombre del medio es menor al buscado -> buscar a la derecha
                bajo = medio + 1;
            }
        }
        //6. Retornar -1 si no se encuentra
        return -1;
    }

    public int findByAge(int edad) {
        //Ordenado -> Edad
        personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
        //Busqueda binaria
        int bajo = 0;
        int alto = personas.size() -1;
        while (bajo <= alto){
            int medio = (bajo + alto) / 2;
            int comp = Integer.compare(personas.get(medio).getEdad(), edad);
            if(comp == 0){
                return medio;
            }else if(comp > 0){
                alto = medio - 1;
            }else{
                bajo = medio + 1;
            }
        }
        return -1;
    }

    public int findByPerson(Persona p){
        // 1. Crear el comparador con los 3 criterios
        Comparator<Persona> comparador = Comparator.comparing(Persona::getNombre)
                .thenComparingInt(Persona::getEdad)
                .thenComparing(Persona::getGenero);
        // 2. Ordenar la lista usando ese comparador
        personas.sort(comparador);
        //Busqueda binaria
        int bajo = 0;
        int alto = personas.size() -1;
        while (bajo <= alto){
            int medio = (bajo + alto) / 2;
            int comp = personas.get(medio).getNombre().compareTo(p.getNombre());
            if(comp == 0){
                return medio;
            }else if(comp > 0){
                alto = medio - 1;
            }else{
                bajo = medio + 1;
            }
        }
        return -1;
    }
}
