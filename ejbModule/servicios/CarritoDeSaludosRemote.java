
package servicios;

import java.util.List;

import javax.ejb.Remote;
//Stigma: Alvaro De Leon, Carlos Suarez, Jose Madrid y Santiago Da Silva

@Remote
public interface CarritoDeSaludosRemote {
	
	void agregarSaludos(String nombre);
	
	List<String> obtenerSaludos();
	
}
