package servicios;

import javax.ejb.Remote;

//Stigma: Alvaro De Leon, Carlos Suarez, Jose Madrid y Santiago Da Silva

@Remote
public interface SaludoBeanRemote {
	
	String saludar(String nombre);

}
