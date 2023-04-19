package ar.unrn.tp4.eje2.infraestructure.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ar.unrn.tp4.eje2.domain.portsout.EmpleadoRecord;
import ar.unrn.tp4.eje2.domain.portsout.Lectura;

public class ArchivoLectura implements Lectura{
	private String archivo;
	
	public ArchivoLectura(String nombreArchivo) {
		Objects.requireNonNull(nombreArchivo);
		
		if(nombreArchivo.isEmpty() || nombreArchivo.isBlank()) {
			throw new RuntimeException("El nombre del archivo no puede estar vacio");
		}
		
		this.archivo = nombreArchivo;
	}

	@Override
	public List<EmpleadoRecord> Leer() {
		List<EmpleadoRecord> lista = new ArrayList<>();
		
		try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(this.archivo));
            
            String cadena;
            
            while ((cadena = bufferReader.readLine()) != null) {
                String[] atributos = cadena.split(",");

                String apellido = atributos[0];
                String nombre = atributos[1];
                String fechaNacimiento = atributos[2];
                String correo = atributos[3];
                
                EmpleadoRecord empleado = new EmpleadoRecord(apellido, nombre, fechaNacimiento, correo);
                lista.add(empleado);
            }
            
            bufferReader.close();

        } catch (IOException e) {
        	
        }
		
		return lista;
	}

}
