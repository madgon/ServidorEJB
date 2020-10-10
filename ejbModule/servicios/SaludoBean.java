package servicios;

import javax.ejb.LocalBean;

import javax.ejb.Stateless;

//Stigma: Alvaro De Leon, Carlos Suarez, Jose Madrid y Santiago Da Silva

/**
 * Session Bean implementation class SaludoBean
 */
@Stateless
@LocalBean
public class SaludoBean implements SaludoBeanRemote {

    /**
     * Default constructor. 
     */
    public SaludoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
