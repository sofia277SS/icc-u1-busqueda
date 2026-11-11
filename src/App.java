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

        System.out.println("----------- Busqueda lineal -----------");
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
        
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);
        System.out.println("----------- Busqueda binaria -----------");
        int resultado = busquedaBinaria.findByName2("Anaa");
        if (resultado == -1) {
            System.out.println("Persona no encontrada");
        } else {
            System.out.println("La posicion de la persona que busca es " + resultado);
        }

        int res = busquedaBinaria.findByName2("Pedro");
        //OPERADOR TERNARIO
        // condicion ? valor_si_verdadero : valor_si_falso
        System.out.println(res >= 0 ? "Persona encontrada en la posicicion " + res 
        : "Persona no encontrada");

        int res2 = busquedaBinaria.findByAge(25);
        System.out.println(res2 >= 0 ? "Persona de 25 años encontrada en la posicicion " + res2 
        : "Persona no encontrada");

        Persona pBuscar = new Persona("Maria", 30, "F");
        int res3 = busquedaBinaria.findByPerson(pBuscar);
        System.out.println(res3 >= 0 ? "El objeto Persona encontrado en la posicicion " + res3 
        : "Persona no encontrada");
    }
}
