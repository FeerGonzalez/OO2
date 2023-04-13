package ar.unrn.eje4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.jdbi.v3.core.Jdbi;

public class PersonaRepository {

  private Jdbi jdbi;

  public PersonaRepository(Jdbi jdbi) {
	  Objects.requireNonNull(jdbi);
	  this.jdbi = jdbi;
  }

  /**
   * Busca por nombre a parte 
   * */
  public List<Persona> buscarPorNombre(String nombreOParte) {
    return jdbi.withHandle(handle -> {
      var rs = handle
          .select("select nombre, apellido from persona where nombre like ?")
          .bind(0, "%" + nombreOParte + "%").mapToMap(String.class).list();

      var listaPersonas = new ArrayList<Persona>();

      if (rs.size() == 0) {
        return listaPersonas;
      }

      for (Map<String, String> map : rs) {
        listaPersonas.add(new Persona(map.get("nombre"), map.get("apellido")));
      }

      return listaPersonas;
    });

  }


  /**
   * Dado un id, retorna: 
   * - null si el id no se encuentra en la BD 
   * - la instancia de Persona encontrada
   */
  public Optional<Persona> buscarId(Long id) {
	  Persona persona = jdbi.withHandle(handle -> {

      var rs = handle
          .select("select nombre, apellido from persona where id_persona = ?")
          .bind(0, id).mapToMap(String.class).list();

      if (rs.size() == 0) {
    	  return null;
//    	throw new RuntimeException("No existe una persona con ese id");
//        return new Persona("-1", "-1"); //Ya no retorna null, ahora retorna una persona con datos numericos
      }										//que representa su inexistencia

      return new Persona(rs.get(0).get("nombre"), rs.get(0).get("apellido"));

    });
    
	  if(persona != null) {
		  return Optional.of(persona);
	  }
	  
    return Optional.empty();
  }

}
