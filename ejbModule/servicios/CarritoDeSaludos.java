package servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CarritoDeSaludos
 */
@Stateful
public class CarritoDeSaludos implements CarritoDeSaludosRemote {
	@EJB
	SaludoBean saludo;
	
	private List<String> saludos = new ArrayList<>();

    /**
     * Default constructor. 
     */
    public CarritoDeSaludos() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void agregarSaludos(String nombre) {
		
		saludos.add(saludo.saludar(nombre));
		
	}

	@Override
	public List<String> obtenerSaludos() {
		
		return saludos;
	}
    

}
