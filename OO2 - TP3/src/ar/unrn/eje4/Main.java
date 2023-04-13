package ar.unrn.eje4;

import java.util.Optional;

import org.jdbi.v3.core.Jdbi;

public class Main {

  public static void main(String[] args) {

    Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

    new SetUpDatabase(jdbi).setUp();

    var repo = new PersonaRepository(jdbi);
    var listaPersonas = repo.buscarPorNombre("Vla");

    for (Persona persona : listaPersonas) {
      System.out.println(persona.getNombre() + " " + persona.getApellido());
    }
    
    Optional<Persona> optionalPersona = repo.buscarId(5L);
    
    if(optionalPersona.isPresent()) {
    	Persona persona = optionalPersona.get();
    	System.out.println(persona.getNombre() + " " + persona.getApellido());
    }
    
//    if (personas != null) {
//      for (Persona persona : personas) {
//        System.out.println(persona.getNombre() + " " + persona.getApellido());
//      }
//    }

//    var persona = repo.buscarId(1L);
//    if (persona != null) {
//      System.out.println(persona.nombre() + " " + persona.apellido());
//    }
  }
}
